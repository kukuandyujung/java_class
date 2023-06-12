//랜덤함수

//let, const(상수), var 요즘에는 let을 추천
var random = Math.floor(Math.random()*10)+1; //1-100

var input= Number(prompt("1-100까지의 숫자를 입력하세요."));
if(input===random){
	document.write("정답! <br> 정답은: ", random);
}else{
	alert("오답 정답: ", random);
	//document.write("오답! <br> 정답은: ", random);
	location.reload();
}

//if(input==random) 숫자형 문자형이어도 같으면 같다고 나옴 
//if(input===random) 타입까지 같아야 하기 때문에 문자형 숫자형이면 다르다고 나옴