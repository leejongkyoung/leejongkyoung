<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ include file="../common/common.jsp" %>
<%@ include file="../common/nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 목록</title>
</head>
<body>
	<div style="padding: 0px 110px 0px 110px;">
	<h1>게시판</h1>
	<table class="table table-hover">
		<tr style="font-size: 16px; font-weight: bold;">
			<td style="width: 150px;">번호</td>
			<td style="width: 760px;">제목</td>
			<td style="width: 250px;">작성자</td>
			<td style="width: 250px;">날짜</td>			
		</tr>
		<c:forEach var="board" items="${ boardList }">
		<tr style="font-size: 14px;">
			<td style="width: 150px;">${ board.boardNo }</td>
			<td style="width: 800px;"><a href="boardDetail?boardNo=${ board.boardNo }">${ board.boardTitle }</a></td>
			<td style="width: 250px;">${ board.boardWriter }</td>
			<td style="width: 250px;"><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${ board.boardRegDate }"/></td>
		</tr>
		</c:forEach>
	</table>
	<a class="btn btn-success" href="writeContent">글쓰기</a>
	</div>
</body>
</html>