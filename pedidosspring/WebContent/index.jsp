<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<div class='container'>
		<div class="row">
			<div class="col-8 offset-2">
				<form action="hacerpedido" method="get"> 
					<div>
						<label>Id cliente:</label>
						<input name="idCliente"> 
					</div>
					<div>
						<label>Id producto:</label>
						<input name="idProducto"> 
					</div>
					<div>
						<label>Unidades:</label>
						<input name="unidades"> 
					</div>
					<input type="submit" value="nuevo">
				</form>
			</div>
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>