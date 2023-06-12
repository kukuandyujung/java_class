var num = 100;
var str = "200";
document.write(num + str, "<br>");

var num2 =  parseInt(str); //정수형 타입으로 형 변환
var num2 =  parseFloat(str); //실수형 타입으로 형 변환
var num3 =  Number(str); //정수형, 실수형 모든 타입으로 변환 
document.write(num + num2, "<br>");
document.write(num + num3, "<br>");