<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<c:url value="/content/css/bootstrap.css" var="bootstrap"></c:url>
	<link href="${bootstrap}" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body class="bg-primary">
	<div class='container'>
		<div class="row">
			<div class="bg-light text-success">
				<h1><c:out value="${titulo}" /></h1>
				<div class="alert alert-success">
					<c:out value="${mensaje}"></c:out>
				</div>
			</div>
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>