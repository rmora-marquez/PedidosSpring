package com.mpersd.spring.modelo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class PedidoTo {
	private int id;
	@Min(value=1) @Max(value=2)
	private int idProducto;
	@Min(value=1) @Max(value=1)
	private int idCliente;
	@Min(value=1) @Max(value=50)
	private int unidades;
	
	public PedidoTo() {	
	}

	public PedidoTo(int id, int idProducto, int idCliente, int unidades) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.idCliente = idCliente;
		this.unidades = unidades;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

}
