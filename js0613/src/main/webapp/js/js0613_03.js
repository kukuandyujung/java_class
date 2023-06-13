//부모창 자식창 값을 전달하기
var openWin; //전역변수? 모든 function에서 사용할 수 있는 변수를 의미한다. 

function popupSend(){
	alert("부모 창으로 값을 전달합니다.")
	opener.document.getElementById("receive").value = document.getElementById("send").value;
}

function sendValue(){
	alert("자식 창으로 값을 전달합니다");
	openWin.document.getElementById("reValue").value = document.getElementById("textInput").value;
}

function popupOpen(){
	openWin= window.open("popup.html", "popupForm", "width=400px, height=550px, resizable=no, scrollbars=no");
	//openWin.document.getElementById("reValue").value = document.getElementById("textInput").value;
}