//아이디 중복체크
var openPop;

function idConfirm(){
	document.getElementById("id").value =document.getElementById("checkId").value;
}

function dbIdCheck(){
	//alert("test");
	document.getElementById("span01").innerText="입력한 아이디는 사용이 가능합니다.";
}

function idCheck(){
	//alert("아이디 중복 체크 창이 열립니다.");
	openPop = window.open("idCheckForm.html", "id", "width=350px, height=500px, scrollbars=no");
}