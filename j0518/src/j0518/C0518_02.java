package j0518;

public class C0518_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기서부터는 이전 수업 복습. 꼭 알아야 하는 것들임!!!!

		      // 프린트 print, printf, println
		      System.out.println("안녕하세요"); // println은 enter를 쳐서 다음줄로 넘김
		      System.out.print("반갑습니다");// ln이 없으면 다음 문장은 옆으로 이어짐
		      System.out.println("이렇게 하면 어떻게 될까요?");

		      int a = 10;
		      int b = 100;
		      //a : 10, b : 100
		      System.out.println("a : " + a + ", b : "+b);
		      
		      int num =1, num2 =2, num3 = 3;
		      //num = 1, num2 = 2, num3 = 3
		      System.out.println("num = " + num +", num2 = " + num2 + ", num3 = " +num3);
		      System.out.printf("num = %d, num2 = %d, num3 = %d \n",num, num2, num3);
		      
		      //10 나누기 3 계산하기
		      System.out.println(10/3.0);// 3.3333333333333335
		      System.out.printf("%.1f \n", 10/3.0); 
		   }// main
		}// class

