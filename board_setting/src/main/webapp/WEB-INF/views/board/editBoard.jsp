<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<% pageContext.setAttribute("replaceChar", "\n"); %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글쓰기</title>
</head>
<body>
	<div style="padding-left: 110px;">
	<h1>게시글 수정</h1>
	</div>
	
	<div style="padding: 0px 110px 0px 110px;; width: 100%;">
	<form class="form-horizontal"
		  action="editContent"
		  method="post"
		  id="editContentForm">
	  <input type="hidden" name="boardNo" value="${ boardList.boardNo }">
	  <input type="hidden" name="regDate" value="${ boardList.boardRegDate }">    
	  <div class="form-group">
	    <label class="col-sm-0 control-label">작성자</label>
	    <div class="col-sm-0">
	      <input type="text" 
			     class="form-control" 
			     name="boardWriter" 
			     placeholder="${ boardList.boardWriter }" 
			     value="${ boardList.boardWriter }"
			     readonly="readonly">
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-0 control-label">제목</label>
	    <div class="col-sm-0">
	      <input type="text" 
			     class="form-control" 
			     name="boardTitle" 
			     id="title"
			     value="${ boardList.boardTitle }">
			    
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-0 control-label">내용</label>
	    <div class="col-sm-0">
	    <textarea class="form-control" 
	    		  rows="5" style="resize: none;" 
	    		  name="boardContent" 
	    		  id="content"
	    		  >${ boardList.boardContent }</textarea>
	    </div>
	  </div>	
		<div class="form-group">
		    <div class="col-sm-offset-0 col-sm-0">
		      <a class="btn btn-info" id="editForm" href="javascript:">수정</a>
		      <a class="btn btn-primary" id="loc-list" href="javascript:">목록</a>
		    </div>
		  </div>
	</form>
	</div>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript">

$(function() {
	
		$('#editForm').on('click', function(event) {
			event.preventDefault();
			var content = document.querySelector('#content');
			var title = document.querySelector('#title');
			if (!title.value) {
				alert('제목을 입력하세요.');
				return false;
			} else if (!content.value) {
				alert('내용을 입력하세요.');
				return false;
			} else {
					var ok = confirm('수정하시겠습니까?');
					if (ok) {
							$('#editContentForm').submit();
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

</script>
	
</body>
</html>