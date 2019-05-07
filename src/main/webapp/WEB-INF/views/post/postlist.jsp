<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Posts list</title>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	</head>
	<body>
		<table class="table">
		 	<thead>
		 	</thead>
		 	<tbody>
		    	<c:choose>
		        	<c:when test="${fn:length(posts) > 0 }">
		            	<c:forEach items="${posts}" var="post">
			                 <tr>
			                 	<th scope="row">${post.IDX }</th>
			                 	<td>${post.TITLE }</td>
			                 	<td>${post.CREATED_ID }</td>
			                 	<td>${post.CREATED_AT }</td>
			                 	<td>${post.HIT_CNT }</td>
		               		</tr>
		             	</c:forEach>
		         	</c:when>
			        <c:otherwise>
			        	<tr>
			            	<td colspan="5">조회된 결과가 없습니다.</td>
			            </tr>
			        </c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</body>
</html>