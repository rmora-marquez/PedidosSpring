package com.mpersd.spring.datos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mpersd.spring.modelo.PedidoTo;

public class PedidoToMapper implements RowMapper<PedidoTo> {

	@Override
	public PedidoTo mapRow(ResultSet rs, int index) throws SQLException {
		PedidoTo pto = new PedidoTo(
				rs.getInt("id"),
				rs.getInt("idProducto"),
				rs.getInt("idCliente"),
				rs.getInt("unidades")   ); 
		return pto;
	}


}
