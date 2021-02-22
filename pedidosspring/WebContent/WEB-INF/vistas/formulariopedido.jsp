<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>  
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
			<div class="col">
				<form:form  method="post" modelAttribute="pedido">
					<div class="form-row">
						<p class="form-control-static">
							<c:out value="${pedido.id}"></c:out>
							<form:input type="hidden" path="id" />
						</p>
					</div>
					<div>
						<label>Id Cliente</label>
						<form:input path="idCliente" type="number"  class="form-control" />
						<form:errors path="idCliente" cssClass="text-danger"></form:errors>
					</div>
					<div>
						<label>Id Producto</label>
						<form:input path="idProducto" type="number" class="form-control" />
						<form:errors path="idProducto" cssClass="text-danger"></form:errors>
					</div>
					<div>
						<label>Unidades</label>
						<form:input path="unidades"  type="number" class="form-control" />
						<form:errors path="unidades" cssClass="text-danger"></form:errors>
					</div>
					<input type="submit" value="Nuevo pedido" class="btn btn-outline-success">
				</form:form>
			
			</div>			
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>