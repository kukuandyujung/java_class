//setInterval
var count = 0;
var interval;
//setInterval 추가 
function setIn(){
	var htmlDAta="";
	htmlDAta += "<tr>";
	htmlDAta += "<td>";
	htmlDAta += "1";
	htmlDAta += "</td>";
	htmlDAta += "</tr>";
	
	$("#t01").append(htmlDAta);
	
    interval=setInterval(function(){
	count +=1;
	console.log("숫자 : ", count);		
	},1000);  // 1/1000초  1000이면 1초를 뜻한다.

}

//setInterval 삭제하기 
function setOut(){
	console.log("멈춤");
	clearInterval(interval);
}
