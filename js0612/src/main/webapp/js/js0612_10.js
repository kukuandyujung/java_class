var dataArr = ["홍길동.","김유리","김유정","김꾸꾸","도레미","루피","조로","상디","로빈","체리"];


var htmlData = "";

htmlData += "<h2>학생 성적 처리 프로그램</h2>";
htmlData += "<table>";
htmlData += '<col width="8%"';
htmlData += '<col width="14%">';
htmlData += '<col width="8%">';
htmlData += '<col width="8%">';
htmlData += '<col width="8%">';
htmlData += '<col width="10%">';
htmlData += '<col width="10%">';
htmlData += '<col width="7%">';
htmlData += '<col width="15%">';
htmlData += '<col width="12%">';
htmlData +=	'</colgroup>';
htmlData += "<tr><th>학번</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th><th>함계</th><th>평균</th><th>등수</th><th>작성일</th><th>작성자</th></tr>";

for(var i =0; i < 10 ; i++){
var random = Math.floor(Math.random()*20)+81;
var random2 = Math.floor(Math.random()*20)+81;
var random3 = Math.floor(Math.random()*20)+81;
var total= random+random2+random3;
var avg = (total/3.0).toFixed(2);
htmlData += "<tr>";
htmlData += "<td>"+(i+1)+"</td>";
htmlData += "<td>"+dataArr[i]+"</td>";
htmlData += "<td>"+ random +"</td>"
htmlData += "<td>"+ random2 +"</td>"
htmlData += "<td>"+ random3 +"</td>"
htmlData += "<td>" + total+ "</td>"
htmlData += "<td>" + avg + "</td>"
htmlData += "<td>1</td>"
htmlData += "<td>2023-06-12</td>"
htmlData += "<td>김유정</td>"
htmlData += "</tr>";
}
htmlData += "</table>";

//document.getElementById('h').innerHTML="<strong>데이터</strong>"
document.write(htmlData);