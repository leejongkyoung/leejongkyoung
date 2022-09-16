<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<% pageContext.setAttribute("replaceChar", "\n"); %>
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ajax 게시판</title>
</head>
<body>
<div style="padding: 0px 110px 0px 110px;">
	<h1>Ajax 게시판</h1>
	<div class="form-check">
	<table class="table table-hover">
		<thead>
		<tr style="font-size: 14px; font-weight: bold;">
			<td style="width: 150px;">
			  <input class="form-check-input" type="checkbox" id="all-check">
			    전체선택
			  <button class="btn btn-danger" id="check-dlt" onclick="checkDlt()">선택삭제</button>
			</td>
			<td style="width: 150px;">번호</td>
			<td style="width: 760px;">제목</td>
			<td style="width: 250px;">작성자</td>
			<td style="width: 250px;">날짜</td>
			<td></td>			
		</tr>
		</thead>
		
		<tbody id="ajaxBoardList">
		</tbody>
	</table>
	</div>
	<button type="button" 
			class="btn btn-success" 
			onclick="formToggle();"
			id="write-btn">글쓰기</button>
	</div>
	
	<!-- 작성 화면 폼 -->
	<div style="padding: 30px 110px 0px 110px;" id="write-form">
	<form class="form-horizontal"
		  method="post"
		  id="writeContentForm">
	  <div class="form-group">
	    <label class="col-sm-0 control-label">제목</label>
	    <div class="col-sm-0">
	      <input type="text" class="form-control" name="boardTitle" id="title" placeholder="제목을 입력하세요.">
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-0 control-label">작성자</label>
	    <div class="col-sm-0">
	      <input type="text" class="form-control" name="boardWriter" id="writer" placeholder="작성자를 입력하세요.">
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-0 control-label">내용</label>
	    <div class="col-sm-0">
	    <textarea class="form-control" 
	    rows="8" style="resize: none;" 
	    name="boardContent" id="content"
	    placeholder="내용을 입력하세요."></textarea>
	    </div>
	  </div>	
		<div class="form-group">
		    <div class="col-sm-offset-0 col-sm-0">
		      <button type="button" class="btn btn-info" id="writeForm">작성</button>
		    </div>
		  </div>
	</form>
	</div>
	<!-- /작성 화면 폼 -->
	
	<!-- 게시글 상세 폼 -->
	<div style="padding: 30px 110px 30px 110px;" id="ajaxBoardDetail">
	<div class="form-group">
	    <label class="col-sm-1 control-label">번호</label>
	    <div class="col-sm-0">
	      <p id="boardNo"></p>
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-1 control-label">작성자</label>
	    <div class="col-sm-0">
	      <p id="boardWriter"></p>
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-1 control-label">작성일자</label>
	    <div class="col-sm-0">
	      <p id="boardRegDate"></p>
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-1 control-label">제목</label>
	    <div class="col-sm-0">
	      <p id="boardTitle"></p>
	    </div>
	  </div>	   
	  <div class="form-group" style="padding-left: 15px;">
	    <label>내용</label><br>
	    <div class="col-sm-0">
	     <p id="boardContent"></p>
	    </div>
	  </div>
	  <button type="button" class="btn btn-primary" id="close-btn">닫기</button>
	</div>
	<!-- /게시글 상세 폼 -->
	
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
<script type="text/javascript">

$(document).ready(function() {
	boardAjaxList();
	$("#write-form").hide();
	writeFormData();
	$("#ajaxBoardDetail").hide();
	hideDetail(); 
	check();
});

function boardAjaxList() {
	$.ajax({
		type: "get",
		url: "/board/ajaxBoardList",
		success:function(result) {
// 			console.log("result==="+result);
// 			console.log("result==="+JSON.stringify(result));
			var h = "";
// 			for(var i = 0; i < result.length; i ++) {
// 				h += "<tr>";
// 				h += "<td>"+result[i].boardNo+"</td>";
// 				h += "<td>"+result[i].boardTitle+"</td>";
// 				h += "<td>"+result[i].boardWriter+"</td>";
// 				h += "<td>"+result[i].boardRegDate+"</td>";
// 				h += "</tr>";
// 			}
			$.each(result, function(index, data) {
				h += "<tr>";
				h += "<td style='width: 150px; padding-right: 50px;'><input class='form-check-input' type='checkbox' name='sel-no' value='"+data.boardNo+"'></td>";
				h += "<td style='width: 150px;'>"+data.boardNo+"</td>";
				h += "<td style='width: 760px;'><a href='javascript:void(0);' onclick='ajaxBoardDetail("+data.boardNo+");'>"+data.boardTitle+"</a></td>";
				h += "<td style='width: 250px;'>"+data.boardWriter+"</td>";
				h += "<td style='width: 250px;'>"+moment(data.boardRegDate).format("YYYY-MM-DD HH:mm:ss");+"</td>";
				h += "<td>"+"<button type='button' class='btn btn-danger' id='delete-btn-"+data.boardNo+"' onclick='boardAjaxDel("+data.boardNo+");'>삭제</button>"+"</td>"
				h += "</tr>";
			});
// 			$('#ajaxBoardList').append(h); 기존데이터도 남아있고 재 출력
			$('#ajaxBoardList').html(h); //기존데이터를 날리고 추가 출력
		},
	    error: function () {
	    	alert("error");
	    }

	});
}

function check() {
   $('#all-check').click(function() {
        if($("#all-check").prop("checked")) {
            $("input[type=checkbox]").prop("checked",true); 
        } else {
            $("input[type=checkbox]").prop("checked",false); 
        }
    });
}

function checkDlt() {

		var selNos = [];
		$('input[name="sel-no"]:checked').each(function(idx, checkBox) { 
			selNos.push($(this).val());
		});
		console.log("selNos==="+selNos);
		alert(selNos);
		if(selNos == 0) {
			alert('삭제 할 대상을 체크하여 주십시오.');
			return false;
		}

		$.ajax({
			"url" : "/board/checkDelete",
			"type" : "get",	
			"data" : {"selNos" : selNos},
// 			"data" : "selNos=" + selNos,
			"traditional" : false,
			"async" : false,
			"success" :  function(data, status, xhr) {
				alert('삭제 성공');
				boardAjaxList();
			},
			"error" : function (xhr, status, err) {
				alert('삭제 실패');
			}
		});
}



function boardAjaxDel (bNo) {
	console.log("bNo==="+bNo);
	var ok = confirm('삭제하시겠습니까?');
	if (!ok) {
		return;
	}
	$.ajax({
		"url" : "/board/deletedPost",
		"type" : "get",
		"async" : true,
		"data" : "boardNo=" + bNo,
		"dataType" : "text",
		"success" : function(data, status, xhr) {
			alert('삭제 성공');
// 			location.reload();
			boardAjaxList();
		},
		"error" : function (xhr, status, err) {
			alert('삭제 실패');
		}
	});	
}

function formToggle() {
	$('#write-form').toggle();
	fnReset();
}

function hideDetail() {
	$('#close-btn').on('click', function(event){
	event.preventDefault();
	$('#ajaxBoardDetail').hide();
	});
}

function fnReset() {
    $("#title").val("");
    $("#writer").val("");
    $("#content").val("");
}

function writeFormData() {
	$('#writeForm').on('click', function(event) {
		event.preventDefault();

		var writer = $('#writer').val();
		var title = $('#title').val();
		var content = $('#content').val();

// 		var writer2 = document.querySelector('#writer').value;
// 		var writer3 = document.getElementById('writer');
// 		console.log("writer21222==="+writer2);
// 		console.log("writer==="+writer);

		if (!title) {
			alert('제목을 입력하세요.');
			return false;
		} else if (!writer) {
			alert('작성자를 입력하세요.');
			return false;
		} else if (!content) {
			alert('내용을 입력하세요.');
			return false;
		} else {  
			var ok = confirm('등록하시겠습니까?');			
			if (ok) {
					//var formData = $('#writeContentForm').serialize();		
					//console.log("formData==="+ formData)
					//var data = { "boardTitle" : title , "boardWriter": writer, "boardContent" : content };	
					//var data = $('#writeContentForm').serialize();	
					var data = JSON.stringify({ "boardTitle" : title , "boardWriter": writer, "boardContent" : content });	
					$.ajax({
						"url" : "/board/ajaxWriteContent",
						"type" : "POST",
						//"data" : formData,
						"contentType" : "application/json; charset=utf-8",
						"data" : data,
						"dataType" : "JSON",
						"async" : false,				
						"success" : function(result) {
							alert('게시글 등록 완료');	
							boardAjaxList();
							fnReset();
						},
						"error" : function() {
							alert('error');
						}
					});
				}
		}
	});
}

function ajaxBoardDetail(boardNo) {
	console.log("boardNo==="+boardNo);
	$.ajax({
		"type" : "get",
		"url" : "/board/ajaxBoardDetail",
		"data" : "boardNo=" + boardNo,
		"dataType" : "JSON",
		"success" : function(result) {
					console.log("result==="+result.boardWriter);
					$("#ajaxBoardDetail").show();
					$('#boardNo').html(result.boardNo);
					$('#boardWriter').html(result.boardWriter);
					$('#boardTitle').html(result.boardTitle);
					$('#boardRegDate').html(result.boardRegDate);
					$('#boardContent').html(result.boardContent);
		},			
		"error" : function () {
			alert('error');
		}
	});	
}

</script>
    
</body>
</html>