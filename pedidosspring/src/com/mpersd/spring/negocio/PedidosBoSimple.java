package com.mpersd.spring.negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpersd.spring.datos.IPedidosDao;
import com.mpersd.spring.modelo.PedidoTo;

@Service
public class PedidosBoSimple implements IPedidosBo {
	public static int cantidadMaxima = 50;
	@Autowired
	private IPedidosDao pdao;
	
	public PedidosBoSimple() {
		System.out.println("PedidosBo creado por Spring");
	}

	@Override
	public void insertarPedido(int idCliente, int idProducto, int unidades) {
		if(cantidadMaxima > unidades){
			pdao.insertarPedido(idCliente, idProducto, unidades);
			//System.out.println("Pedido realizado con "+ unidades + " uds.");
		}else{
			throw new PedidosException("La cantidad solicitada de "+ unidades 
					+ " uds. supera la cantidad maxima de " +  cantidadMaxima+ " uds.");
		}
	}

	@Override
	public void setCantidadMaxima(int max) {
		cantidadMaxima = max;
	}

	@Override
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	@Override
	public List<PedidoTo> todosPedidos() {
		return pdao.todosPedidos();
	}

	@Override
	public PedidoTo buscarPorId(int id) {		
		return pdao.buscarPorId(id);
	}

	@Override
	public void crear(PedidoTo pto) {
		if(pto.getUnidades() < cantidadMaxima){
			pdao.crear(pto);
		}else{
			throw new PedidosException("La cantidad solicitada de "+ pto.getUnidades() 
					+ " uds. supera la cantidad maxima de " +  cantidadMaxima+ " uds.");
		}		
	}

	@Override
	public void actualizar(PedidoTo pto) {
		if(pto.getUnidades() < cantidadMaxima){
			pdao.actualizar(pto);
		}else{
			throw new PedidosException("La cantidad solicitada de "+ pto.getUnidades() 
					+ " uds. supera la cantidad maxima de " +  cantidadMaxima+ " uds.");
		}		
	}

	@Override
	public void borrar(int id) {
		pdao.borrar(id);		
	}

}
