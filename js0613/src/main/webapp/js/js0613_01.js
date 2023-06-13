function test(num, num2){
//	add(num, num2);
//	sub(num, num2);
}
function input(){
 	var num = Number(prompt("숫자를 입력하세요"));
 	var num2 = Number(prompt("숫자를 입력하세요"));
 	console.log(num);
// 	console.log(num); f12에서 결과 값을 확인 할 수 있다
 	var result = add(num,num2);
	console.log("결과값 : ",result);
 	sub(num, num2);
}
function add(num, num2){
	return num+num2;
	}
function sub(num, num2){
	console.log("결과값: ", (num - num2));
}