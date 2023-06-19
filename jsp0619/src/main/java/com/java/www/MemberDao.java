package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	Context context =null;
	DataSource dataSource=null;
	Connection conn=null;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//컬럼타입
	
	String id,pw,name,phone;
	String query;
	int result;
	
	//커넥션 연결 메소드 -conn
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	connection = dataSource.getConnection();
		} catch (Exception e) {e.printStackTrace();}
		return connection;
	}
	
	//로그인 확인 메소드 - 성공 1 실패 0
	public Member selectLogin(String userId, String userPw) {
		System.out.println("userId" +userId );
		Member member = null;
	try{
			
	    	conn = getConnection();
	    	query = "select * from member where id=? and pw=?" ;
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				id= rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				phone=rs.getString("phone");
				member = new Member(id, pw, name, phone);
				
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!= null)rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}catch(Exception e2){e2.printStackTrace();}
	}
	return member;
	}//selectLogin
	
	//1개 회원정보 검색 메소드
	public Member selectMemberOne(String sessionId) {
		Member member = null;
		try{
				
		    	conn = getConnection();
		    	query = "select * from member where id=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1,  sessionId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					id= rs.getString("id");
					pw=rs.getString("pw");
					name=rs.getString("name");
					phone=rs.getString("phone");
					member =new Member(id, pw, name, phone);
					
				}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!= null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2){e2.printStackTrace();}
		}
		return member;
	}//seleMemberOne
	
	//회원정보수정 메소드
	public int updateMember(Member member) {
		
		try{
			conn = getConnection();
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			query = "update member set pw=?, name=?, phone=? where id =?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getId());
			
			//성공하면 1 실패하면 0 이 return.
			result = pstmt.executeUpdate(); //executeUpdate() - insert, update, delete  executeQuery()-select
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2){e2.printStackTrace();}
		}
		return result;
	}//updateMember
	
	
	
	//회원 정보 리스트 메소드 //학생 성적 입력 프로그램 입력할 시에 이렇게 사용할 거.
	public ArrayList<Member> selectMember() {
		ArrayList<Member> list = new ArrayList<>();
		try{
			
	    	conn = getConnection();
	    	query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id= rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				phone=rs.getString("phone");
				list.add(new Member(id, pw, name, phone));
				
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!= null)rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}catch(Exception e2){e2.printStackTrace();}
	}
		return list; 
	}//slectMember
	
	
	//회원 정보 입력 메소드
	public int insertmember(Member member) {
		try{
	    	conn = getConnection();
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			query = "insert into member values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			
			//성공하면 1 실패하면 0 이 return.
			result = pstmt.executeUpdate(); //executeUpdate() - insert, update, delete  executeQuery()-select
		
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}catch(Exception e2){e2.printStackTrace();}
	}
		
		
		return result;
		
	}
}
