package com.mpersd.spring.negocio;

import java.util.List;

import com.mpersd.spring.modelo.PedidoTo;

public interface IPedidosBo {
	void insertarPedido(int idCliente,int idProducto,int unidades);
	void setCantidadMaxima(int max);
	int  getCantidadMaxima();
	
	List<PedidoTo> todosPedidos();
	PedidoTo buscarPorId(int id);
	
	void crear(PedidoTo pto);
	void actualizar(PedidoTo pto);
	void borrar(int id);
}
