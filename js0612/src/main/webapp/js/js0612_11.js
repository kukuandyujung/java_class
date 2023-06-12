/**
 * var num3 = Number(prompt("1번째 숫자를 입력하세요."));
 */
var htmlData = "";
for(var i=0 ; i<3  ; i++){
var name = prompt((i+1) + "번쨰 이름을 입력하세요");
var id = prompt((i+1) + "번쨰 아이디를 입력하세요");
var pass = Number(prompt((i+1) + "번쨰 비밀번호를 입력하세요"));
htmlData += "<tr>";
htmlData += "<td>" + name +"</td>";
htmlData += "<td>" + id +"</td>";
htmlData += "<td>" + pass+ "</td>";
htmlData += "</tr>";
	
}
 document.getElementById("d01").innerHTML = htmlData;

				
					
