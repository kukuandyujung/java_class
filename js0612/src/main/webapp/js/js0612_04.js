//var num = Number(prompt("1번째 숫자를 입력하세요."));
//var num2 = Number(prompt("2번째 숫자를 입력하세요."));

//두 숫자를 입력받아 큰 수를 출력하시오

var num3 = Number(prompt("1번째 숫자를 입력하세요."));
var num4 = Number(prompt("2번째 숫자를 입력하세요."));
var result1 =num3>num4?"1번째 숫자가 큽니다.":"2번째 숫자가 큽니다.";


var result =num3>num4?num3:num4;

document.write("첫번째 숫자는", num3, "<br>");
document.write("두번째 숫자는", num4, "<br>");
document.write("더 큰 수는:", result);

//document.write(typeof(num), "<br>");
//document.write(typeof(num2),"<br>");
//document.write(num+num2,"<br>");
//document.write(Number(num)+ Number(num2),"<br>");