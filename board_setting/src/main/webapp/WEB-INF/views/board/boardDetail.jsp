<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>.
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<% pageContext.setAttribute("replaceChar", "\n"); %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${ boardDetail.boardNo }번 게시글</title>
</head>
<body>
	<div style="padding: 0px 0px 0px 100px;">
	<h1>${ boardDetail.boardWriter }님의 작성 게시글 상세</h1>
	</div>
	
	<div style="padding: 0px 0px 10px 80px;">
	 <div class="form-group">
	    <label class="col-sm-1 control-label">번호</label>
	    <div class="col-sm-0">
	      <p>${ boardDetail.boardNo }</p>
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-1 control-label">작성자</label>
	    <div class="col-sm-0">
	      <p>${ boardDetail.boardWriter }</p>
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-1 control-label">작성일자</label>
	    <div class="col-sm-0">
	      <p><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${ boardDetail.boardRegDate }"/></p>
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-1 control-label">제목</label>
	    <div class="col-sm-0">
	      <p>${ boardDetail.boardTitle }</p>
	    </div>
	  </div>	   
	  <div class="form-group" style="padding-left: 15px;">
	    <label>내용</label><br>
	    <div class="col-sm-0">
	     <p>${fn:replace(boardDetail.boardContent, replaceChar, "<br/>")}</p>
	    </div>
	  </div>
	  </div>
	  <div style="padding: 0px 0px 0px 100px;">
	  <a class="btn btn-info" id="edit-btn">수정</a>
	  <a class="btn btn-danger" id="delete-btn" onclick="location.href='boardDelete?boardNo=${ boardDetail.boardNo }'">삭제</a>
	  <a class="btn btn-primary" href="boardList">목록</a>	
	  </div>
	  <input type="hidden" name="boardNo" id="boardNo" value="${ boardDetail.boardNo }">
	

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript">

$(function() {	
		
		$('#edit-btn').on('click', function(event) {
			event.preventDefault();

			var ok = confirm('게시글을 수정하시겠습니까?');
			if(ok) {
					location.href = "editBoard?boardNo=${ boardDetail. boardNo }";
				}
		});

	
		 $('#delete-btn').on('click', function(event) {
			event.preventDefault();
			
			var ok = confirm('한번 삭제된 게시글은 영구삭제되어 복구 할 수 없습니다. 삭제하시겠습니까?');
			if(ok) {
				location.href="boardDelete?boardNo=${ boardDetail.boardNo }"	
				}
		}); 
});

</script>
	
</body>
</html>