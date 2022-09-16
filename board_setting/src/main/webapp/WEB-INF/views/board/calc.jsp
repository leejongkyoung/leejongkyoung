<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<style>
.my-tb {
	border : solid 1px;
	border-color : gray;
	width : 1400px;
}
tr, td {
	border : solid 1px;
	border-color : gray;
	width: 350px;
	height: 50px;
	padding: 15px;

}
.bg.active {
	background-color: gray;
}
.clicked {
    background-color: #ccc;
}
</style>
<head>
	<meta charset="UTF-8">
	<title>계산기</title>
</head>
<body>
<div style="padding: 50px 0px 0px 100px;">
	
	<table class="my-tb" id="tbl">
		<tr>
			<td colspan="4" style="text-align: right;" id="display" value=""></td>
		</tr>
		<tr>
			<td class="bg" id="7" onclick="add('7')"><input type="button" value="7" />7</td>
			<td class="bg" id="8" onclick="add('8')"><input type="button" value="8" />8</td>
			<td class="bg" id="9" onclick="add('9')"><input type="button" value="9" onclick="add('9')"/>9</td>
			<td class="bg" id="mul" onclick="add('*')"><input type="button" value="*" />X</td>
		</tr>
		<tr>
			<td class="bg" id="4" onclick="add('4')"><input type="button" value="4" />4</td>
			<td class="bg" id="5" onclick="add('5')"><input type="button" value="5"/>5</td>
			<td class="bg"  id="6" onclick="add('6')"><input type="button" value="6" />6</td>
			<td class="bg" id="min" onclick="add('-')"><input type="button" value="-" />-</td>
		</tr>
		<tr>
			<td class="bg" id="1" onclick="add('1')"><input type="button"  value="1" />1</td>
			<td class="bg" id="2" onclick="add('2')"><input type="button" value="2" />2</td>
			<td class="bg" id="3" onclick="add('3')"><input type="button" value="3"  />3</td>
			<td class="bg" id="sum" onclick="add('+')"><input type="button" value="+" />+</td>
		</tr>
		<tr>
			<!-- <td id="del"><input type="button" value="del" onclick="del(); return false;" />Del</td> -->
			<td class="bg" id="backspace"><input type="button" value="del" />Del</td>
			<td class="bg" id="0" onclick="add('0')"><input type="button" value="0" />0</td>
			<td class="bg" id="dot" onclick="add('.')"><input type="button" value="." />.</td>
			<td class="bg" id="eq" onclick="cal(); return false;"><input type="button" value="=" />=</td>
		</tr>
	</table>
</div>

<script type="text/javascript">
$(document).ready(function() {
	
});

function add(str) {
 	console.log("click Value ====" + str);
	if (str==="*") {
		var id = "#mul";
	} else if (str==="+") {
		var id = "#sum";
	} else if (str==="-") {
		var id = "#min";
	} else if (str==="=") {
		var id = "#eq";
	}  else if (str===".") {
		var id = "#dot";
	} else {
		var id = "#"+ str;
	}
	console.log("id====" + id);
	$(id).css("background-color", "gray");
	
	resetCss();

	var values = $('#display').val();
	values = values + str;
	console.log("true or false ==== " + values.startsWith('*'));	
	if(values.startsWith('*') === true ||
	   values.startsWith('-') === true ||
	   values.startsWith('+') === true || 
	   values.startsWith('.') === true) {
		$('#display').text("");
		return;
	} else {
		if( values.endsWith('*') === true ||
		    values.endsWith('-') === true ||
		    values.endsWith('+') === true || 
		    values.endsWith('.') === true) {
	        var isNumber = values.slice(0, -1);
	        if(isNaN(isNumber)) {
	            return;
	        }
			$('#display').text(values);
			$('#display').val(values);
			return;
		}
		$('#display').text(values);
		$('#display').val(values);
		backspace(values);	
		return;
	}
	var endVal = $('#display').val(values);
	if (endVal === "=") {
		$('#display').text("");
	}

}

function backspace(values) {
	$('#backspace').on('click', function(event) {	
		$('#backspace').css("background-color", "gray");
		resetCss();	
		/*  values1 = values.replace(/,$/, ''); */
		values = values.slice(0, -1);
		$('#display').text("");
		$('#display').text(values);
		$('#display').val(values);	
	});
} 

function cal() {
	var result = eval($('#display').text());
	$('#eq').css("background-color", "gray");
	resetCss();
	$('#display').text(result);
	$('#display').val("");
}

/* function del() {
	
	$('#display').text("");	
} */

function resetCss() {
	setTimeout(function() {		
		$('td').css("background-color", "");
	}, 100);
	
}


</script>
</body>
</html>