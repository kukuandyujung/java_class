//시간 가져오기
//var의 단점이 let의 경우에는 중복해서 같은 변수를 넣으면 오류가 나오는데 var의 경우는 에러가 나지 않는다.  

var a=0; //변수 선언
let aaa=0; //변수 선언 
const bbb=0; //상수 선언 

var interval; 

function start(){

	interval = setInterval(function(){
    var today =new Date();
	var hours = today.getHours();
	var minutes = today.getMinutes();
	var seconds = today.getSeconds();
	var millisecondes = today.getMilliseconds();
	if (seconds<10){document.getElementById("h01").innerText= hours + ":" +minutes + ":" + "0"+seconds;}
	else{document.getElementById("h01").innerText= hours + ":" + minutes + ":" + seconds;}
	
		
	},1000);

}