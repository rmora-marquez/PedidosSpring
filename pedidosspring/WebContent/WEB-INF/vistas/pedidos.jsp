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
			<div class="col-6 offset-3">
				<c:if test="${param.guardado != null}">
					<div class="alert alert-success">
						Guardado correctamente
					</div>
				</c:if>
				<c:if test="${param.borrado != null}">
					<div class="alert alert-danger">
						Borrado correctamente
					</div>
				</c:if>
			</div>
		</div>
		<div class="row">
			<c:url var="nuevo" value="/pedidos/nuevo"></c:url>
			<a class="btn btn-primary" href="${nuevo}">Nuevo pedido</a>
			<table class="table">
				<thead class="table table-dark">
					<tr>
						<th>Id</th> <th>IdProducto</th>
						<th>IdCliente</th> <th>Unidades</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="pedido" items="${listaPedidos}">
						<tr>
							<td><c:out value="${pedido.id}" /></td>
							<td><c:out value="${pedido.idProducto}" /></td>
							<td><c:out value="${pedido.idCliente}" /></td>
							<td><c:out value="${pedido.unidades}" /></td>
							<td>
								<c:url var="detalle" value="/pedidos/detalle">
									<c:param name="id" value="${pedido.id}"></c:param>
								</c:url>
								<a href="${detalle}" class="btn btn-primary">Detalle</a> 
								<c:url var="editar" value="/pedidos/editar">
									<c:param name="id" value="${pedido.id}"></c:param>
								</c:url>
								<a href="${editar}" class="btn btn-success">Editar</a>
								<c:url var="borrar" value="/pedidos/borrar">
									<c:param name="id" value="${pedido.id}"></c:param>
								</c:url>
								<a href="${borrar}" class="btn btn-danger" >Borrar</a>								
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>