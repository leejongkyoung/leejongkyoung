<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글쓰기</title>
</head>
<body>
	<div style="padding: 0px 110px 0px 110px;">
	<h1>게시글 작성하기</h1>
	
	<form class="form-horizontal"
		  action="writeContent"
		  method="post"
		  id="writeContentForm">
	  <div class="form-group">
	    <label class="col-sm-0 control-label">작성자</label>
	    <div class="col-sm-0">
	      <input type="text" class="form-control" name="boardWriter" id="writer" placeholder="작성자를 입력하세요.">
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-0 control-label">제목</label>
	    <div class="col-sm-0">
	      <input type="text" class="form-control" name="boardTitle" id="title" placeholder="제목을 입력하세요.">
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-0 control-label">내용</label>
	    <div class="col-sm-0">
	    <textarea class="form-control" rows="5" style="resize: none;" name="boardContent" id="content"></textarea>
	    </div>
	  </div>	
		<div class="form-group">
		    <div class="col-sm-offset-0 col-sm-0">
		      <a class="btn btn-info" id="writeForm" href="javascript:">작성</a>
		      <a class="btn btn-primary" id="loc-list" href="javascript:">목록</a>
		    </div>
		  </div>
	</form>
	</div>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript">

$(function() {
		$('#writeForm').on('click', function(event) {
			event.preventDefault();

			var writer = document.querySelector('#writer');
			var title = document.querySelector('#title');
			var content = document.querySelector('#content');

			if (!writer.value) {
				alert('작성자를 입력하세요.');
				return false;
			} else if (!title.value) {
				alert('제목을 입력하세요.');
				return false;
			} else if (!content.value) {
				alert('내용을 입력하세요.');
				return false;
			} else {
				var ok = confirm('등록하시겠습니까?');
				if (ok) {
						$('#writeContentForm').submit();
					}
			}
		});
		
		$('#loc-list').on('click', function(event) {
			event.preventDefault();

			var ok = confirm('작성중인 내용이 있습니다. 목록으로 이동하시겠습니까?');
			if(ok) {
					location.href = "boardList";
				}
		});

});

function boardList() {
	console.log("여기가 ajax리스트");
	$.ajax
}

</script>
	
</body>
</html>