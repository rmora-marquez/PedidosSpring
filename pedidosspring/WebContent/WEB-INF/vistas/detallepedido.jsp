<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<c:url var="bootstrap" value="/content/css/bootstrap.css" />
	<link href="${bootstrap}" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<div class='container'>
		<div class="row">
			<div class="alert alert-secondary">
				<ul class="list-group">
					<li class="list-group-item active">ID: <c:out value="${pedido.id}" /></li>
					<li class="list-group-item">Id Producto: <c:out value="${pedido.idProducto}" /></li>
					<li class="list-group-item">Id Cliente: <c:out value="${pedido.idCliente}" /></li>
					<li class="list-group-item">Unidades: <c:out value="${pedido.unidades}" /> </li>
				</ul>
			</div>
				

		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>