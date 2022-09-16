<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<style>
p {
   margin-bottom: 0px;
}

.btn {
	border-color: black;
}
</style>
<head>
	<meta charset="UTF-8">
	<title>Test</title>
</head>
<body>
<div style="padding: 50px 0px 0px 50px;">
	<div style="padding: 0px 0px 30px 0px;">
		<h4>TEST 2 - 구구단</h4>
		<select class="form-select form-select-m" aria-label=".form-select-m example" id="dan-no">
		  <option selected>선택</option>
		  <option value="1">1단</option>
		  <option value="2">2단</option>
		  <option value="3">3단</option>
		  <option value="4">4단</option>
		  <option value="5">5단</option>
		  <option value="6">6단</option>
		  <option value="7">7단</option>
		  <option value="8">8단</option>
		  <option value="9">9단</option>
		</select>
		<button type="button" class="btn btn-outline-dark btn-xs" onclick="gugudan()">계산</button>
		<p id="print"></p>	
	</div>
	<div>
		<h4>TEST 4 - 색상변경</h4>
		<div id="all">
			<p id="one">첫번째</p>
			<p id="two">두번째</p>
			<p id="three">세번째</p>
			<p id="four">네번째</p>
		</div>
		<div style="padding-top: 10px;">
		<select class="form-select form-select-m" aria-label=".form-select-m example" id="order">
		  <option selected>선택</option>
		  <option value="all">전체</option>
		  <option value="0">첫번째</option>
		  <option value="1">두번째</option>
		  <option value="2">세번째</option>
		  <option value="3">네번째</option>
		</select>
		<select class="form-select form-select-m" aria-label=".form-select-m example" id="col">
		  <option selected>선택</option>
		  <option value="red">빨강</option>
		  <option value="blue">파랑</option>
		  <option value="yellow">노랑</option>
		  <option value="green">초록</option>
		</select>
		<button type="button" class="btn btn-outline-dark btn-xs" onclick="colorChange()">변경</button>	
		</div>	
	</div>
	<div style="padding-top: 10px;">
		<h4>TEST 6</h4>
		<input type="text" style="width: 50px; height: 22px;" id="reg-number" >
		<button type="button" class="btn btn-outline-dark btn-xs"  onclick="showNumbers()">선택</button>
		<table id="show-numbers" border="1">			
		</table>
	</div>
	
</div>
<script type="text/javascript">
$(document).ready(function() {
	$('#print').hide();
});

function gugudan() {
	$('#print').show();
	var dan = $('#dan-no').val();
	console.log("dan===" + dan);
	var gugudan = "";
	for(var i = 1; i < 10; ++i) {
		gugudan += dan + " X " + i + " = " + (dan * i) + "<br>";
	}
	console.log(gugudan);
	$('#print').html(gugudan);
	
}


function colorChange() {
	var order = $('#order').val();
	var col = $('#col').val();
	$("#all").find("p").removeAttr("style");
	if(order == "all") {
		$("#all").find("p").css("color", col);
	} else {
		$("#all").find("p").eq(order).css("color", col);
	}
// 	var order = $('#order').val();
// 	var col = $('#col').val();
// 	console.log("순서와 색상==="+ order, col);
	
// 	if(col === '선택') {
// 		alert('변경할 색상을 선택해 주세요.');
// 		return false;
// 	} else if (order === '0')	{
// 		$('#all').css("color", col);
// 	} else if (order === '1') {
// 		$('#one').css("color", col);
// 	} else if (order === '2') {
// 		$('#two').css("color", col);
// 	} else if (order === '3') {
// 		$('#three').css("color", col);
// 	} else if (order === '4') {
// 		$('#four').css("color", col);
// 	}

}

function showNumbers() {
	var v = $('#reg-number').val();
	var v4 = 0;
	if((4 - v%4) != 4) {
		v4 = 4 - v%4; 
	}
	v = Number(v) + Number(v4);
	var h = "";
	for(var i = 1; i <= v; i ++) {
		if(i%4 == 1) {
			h += "<tr>";
		}
		if((v-v4) < i) {
			h += "<td>X</td>";
		} else {
			h += "<td>"+i+"</td>";
		}
		if(i%4 == 0) {
			h += "</tr>";
		}
	}
	$('#show-numbers').html(h);
// 	var number = $('#reg-number').val();
// 	console.log("reg number === " + number);
// 	if(number == 0) {
// 		$('#show-numbers').hide();
// 	}
// 	var num = 1;
// 	var tbl = "";
// 	for(j = 0; j < num; j++) {
// 		tbl += "<tr>";
// 			for(i = 0; i < 4; i++) {
// 				console.log("num==="+num);
// 				tbl += "<td style='width: 60px; height: 40px;'>"+ num +"</td>";
// 				num++;
// 				if(num > number) {
// 					var num = "X";
// 				}
// 				if(!num) {
// 					var num = "X";
// 				}
						
// 			}
// 		tbl += "</tr>";
// 	}
// 	$('#show-numbers').html(tbl);
}
</script>
</body>
</html>