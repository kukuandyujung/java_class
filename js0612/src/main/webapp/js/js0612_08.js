/**
 * 
 */
//var input = Number(prompt("숫자를 입력하세요"));


var htmlData = "<table>";		
for(var i=2; i<10;i++){
//document.write("[ " + i + " 단 ]", "<br>");
	htmlData += "<td colspan='5'>" +i+ "단" +"</td>";
	for(var j=1; j<10; j++){
		htmlData += "<tr>";
		htmlData += "<td>"+i+"</td>";
		htmlData += "<td>*</td>";
		htmlData += "<td>"+j+"</td>";
		htmlData += "<td>=</td>";
		htmlData += "<td>"+i*j+"</td>";
		htmlData += "</tr>";
		//document.write(i + " * "  + j +  " = " + (i*j), "<br>");
		
	}
}

htmlData += "</table>";

document.write(htmlData);