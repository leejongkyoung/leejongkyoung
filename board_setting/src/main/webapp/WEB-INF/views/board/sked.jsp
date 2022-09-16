<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<style>
.table {
		width: 900px;
    	clear: both;
    	margin: auto;
		border: none;
		table-layout: fixed;
}
.md-tbl {
		width: 100%;
    	margin: auto;
    	border-spacing: 10px;
    	border-collapse: separate;
}
thead tr {
  border-bottom: 10px solid white;
}
th {
    height: 50px;
    text-align: center;
    border-color: white;
    border-bottom-color: white;
}
td {
    text-align: center;
    height: 50px;
    background-color: white;  
    border-color: white;
    border-bottom-color: white;
}
input {
	    border: none;
	    background-color: white;
	    font-size: 30px;
}

.year_mon {
    		font-size: 25px;
}
.colToday {
    		background-color: white;
}
.left {
		text-align: left;
}
.right {
		text-align: right;
}
/* td:nth-child(8n+1) {
					background-color: #EA868F;
}

td:nth-child(7n) {
					background-color: #9EC5FE;
}
 */
.year {
		text-align: center;
		font-size: 30px;
		color: black;
		font-weight: bold;
}



</style>
<head>
	<meta charset="UTF-8">
	<title>캘린더</title>
</head>
<body>
<div style="padding: 50px 50px 50px 50px;">
	<table class="table" id="calendar">
		<caption class="year" id="year"></caption>
		<thead>
			<tr>
				<th><input name="preMon" type="button" value="↶"></th>
				<th colspan="5" class="year_mon" id="mon"></th>
				<th><input name="nextMon" type="button" value="↷"></th>
			</tr>
			<tr>
				<th>일</th>
				<th>월</th>
				<th>화</th>
				<th>수</th>
				<th>목</th>
				<th>금</th>
				<th>토</th>
			</tr>
		</thead>
		<tbody id="calendar-body" class="calendar-body">			
		</tbody>
	</table>
	
	<!-- Modal -->
	<div class="modal fade" id="cal-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">스케줄입력</h5>
	        <h6>2022년 6월 13일</h6>
	      </div>
	      <div class="modal-body">
	        <table class="md-tbl">		 
	        	<tr>
	        		<th>시간</th>
	        		<th class="left" width="80%;">내용</th>
	        		<th>중요</th>
	        		<th>삭제</th>
	        	</tr>
	        	<tr>
	        		<td id="skedTime"></td>
	        		<td id="skedContent"></td>
	        		<td id="imp"></td>
	        		<td onclick=""></td>
	        	</tr>
	        </table>
			<div style="padding-left: 20px;">
				<div style="padding-top: 20px;">
					<p>시간</p>
					<input type="time">
				</div>
				<div style="padding-top: 20px;">
					<p>내용</p>				
					<input class="form-control form-control-lg" type="text" name="calContents" placeholder="스케줄 내용을 입력해주세요.">
				</div>
				<div class="form-check" style="padding-top: 20px;">
				  <input type="checkbox" name="important" id="checked-imp" height="30px;" >
				   &nbsp;중요스케줄 (체크 시 <span style="color: red;">*</span>표시됩니다.)
				</div>
			</div>
	        
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" onclick="closeModal()">Close</button>
	        <button type="button" class="btn btn-primary">Save</button>
	      </div>
	    </div>
	  </div>
	</div>

</div>

<script type="text/javascript">
$(document).ready(function() {
	nowDate();
	buildCalendar();
});

var today = new Date();
var date = new Date();   
function nowDate() {
	var now = new Date();
	//$("#yearMon").eq(0).text(now);

    $("input[name=preMon]").click(function() { 
        $("#calendar > tbody > td").remove();
        $("#calendar > tbody > tr").remove();
        today = new Date ( today.getFullYear(), today.getMonth()-1, today.getDate());
        buildCalendar();
    })
    
    $("input[name=nextMon]").click(function(){ 
        $("#calendar > tbody > td").remove();
        $("#calendar > tbody > tr").remove();
        today = new Date ( today.getFullYear(), today.getMonth()+1, today.getDate());
        buildCalendar();
    })

}

function buildCalendar() {
    
    nowYear = today.getFullYear();
    nowMonth = today.getMonth();
    nowDay = today.getDay();
    firstDate = new Date(nowYear,nowMonth,1).getDate();
    firstDay = new Date(nowYear,nowMonth,1).getDay(); 
    lastDate = new Date(nowYear,nowMonth+1,0).getDate();

    console.log("===== firstDay ===== " + firstDay);
    console.log("===== lastDate ===== " + lastDate);
    console.log("===== firstDate ===== " + firstDate);
    console.log("===== nowDay ===== " + nowDay);
    
    
    if((nowYear%4===0 && nowYear % 100 !==0) || nowYear%400===0) { 
        lastDate[1]=29;
    }
    $("#year").text(nowYear);
    $("#mon").text((nowMonth+1)+"월");

    for (i = 0; i < firstDay; i++) { //첫번째 줄 빈칸
        $("#calendar tbody:last").append("<td></td>");
    }
    for (i = 1; i <= lastDate; i++){ // 날짜 채우기
        plusDate = new Date(nowYear,nowMonth,i).getDay();
        console.log("===== plusDate ===== " + plusDate);
        if (plusDate == 0) {
            $("#calendar tbody:last").append("<tr></tr>");
        } 
        $("#calendar tbody:last").append("<td class='date' onclick='modal()'>"+ i +"</td>");
    }
    if($("#calendar > tbody > td").length%7!=0) { //마지막 줄 빈칸
        for(i=1; i<= $("#calendar > tbody > td").length%7; i++) {
            $("#calendar tbody:last").append("<td class='box'></td>");
        }
    }
    $(".date").each(function(index){ // 오늘 날짜 표시
        if(nowYear==date.getFullYear() && nowMonth==date.getMonth() && $(".date").eq(index).text()==date.getDate()) {
            $(".date").eq(index).addClass('colToday');
        }
    }) 
}

function modal() {
	$('#cal-modal').modal();
}
function closeModal() {
	$('#cal-modal').modal('hide');
}

</script>
</body>
</html>