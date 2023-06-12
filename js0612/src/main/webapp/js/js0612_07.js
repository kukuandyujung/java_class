var input = Number(prompt("처름 숫자를 입력"))
var input2 = Number(prompt("마지막 숫자를 입력"))

//for(var i=1; i<=input ; i++){
//	sum+=i;
//}
//
//document.write("입력한 숫자 합", sum);
var sum=0;

//삼항식 이용
//var num=(input<input2)?input:input2;
//var num2=(input>input2)?input:input2;

var num= Math.min(input, input2); //3개까지 비교 가능
var num2= Math.max(input, input2);
	for(var i=num; i<=num2 ; i++){
	if(i%2 !=0){
	sum += i;
}
}
document.write("입력한 숫자 합", sum);


//for(var i=input; i<=input2 ; i++){
//	if(i%2 !=0){
//	sum += i;
//		
//	}
//}


//for(var i=input; i<=input2 ; i++){
//	if(i%2 !=0){
//	sum += i;
//		
//	}
//}
