package com.mpersd.spring.datos;

import java.util.List;

import com.mpersd.spring.modelo.PedidoTo;

public interface IPedidosDao {
	void insertarPedido(int idCliente, int idProducto, int unidades);
	
	List<PedidoTo> todosPedidos();
	PedidoTo buscarPorId(int id);
	
	void crear(PedidoTo pto);
	void actualizar(PedidoTo pto);
	void borrar(int id);
}
