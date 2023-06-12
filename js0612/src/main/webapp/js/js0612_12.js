var arr1 = ["홍길동", "유관순", "이순신"];
var arr2 = ["강감찬", "김구"];

//기본 for문
var result = arr1.push("김유신"); //초기식;조건식;증감식
for(var i=0 ; i<arr1.length; i++){
	document.write(arr1[i], "<br>");
}

//단순 for문
for(var i of arr1){ //배열을 받는 변수 of 배열 ㄴ
	document.write("배열: ", i);
	document.write("<br>");
}


document.write(result);
console.log(arr1);
 
 
 
 
//var arr = [30, "홍길동", true, 31.25];
//for(var i=0;i<arr.length;i++){
//document.write(arr[i], "<br>");
//
