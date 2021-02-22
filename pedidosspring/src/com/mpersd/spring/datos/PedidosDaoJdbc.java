package com.mpersd.spring.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mpersd.spring.modelo.PedidoTo;

@Repository("jdbc")
public class PedidosDaoJdbc implements IPedidosDao {
	
	private JdbcTemplate plantilla;
	
	@Autowired
	public void setDataSource(DataSource ds){
		this.plantilla = new JdbcTemplate(ds);
	}
//	@Autowired
//	private DataSource ds;
	
	public PedidosDaoJdbc() {
		System.out.println("PedidosDao creado");
	}

	@Override
	public void insertarPedido(int idCliente, int idProducto, int unidades) {
		String sql = "INSERT INTO pedidos(idCliente,idProducto,unidades) VALUES (?,?,?)";
		plantilla.update(sql, idCliente, idProducto, unidades);		
//		try {
//			Connection con = ds.getConnection();
//			String sql = "INSERT INTO pedidos(idCliente,idProducto,unidades) VALUES (?,?,?)";
//			PreparedStatement cmd = con.prepareStatement(sql);
//			cmd.setInt(1, idCliente);
//			cmd.setInt(2, idProducto);
//			cmd.setInt(3, unidades);
//			cmd.executeUpdate();
//			System.out.println("Pedido insertado en BD con " + unidades + " uds.");
//			cmd.close();
//			con.close();
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
	}

	@Override
	public List<PedidoTo> todosPedidos() { 
		String sql  = "SELECT * FROM pedidos";
		return plantilla.query(sql, new PedidoToMapper());
	}

	@Override
	public PedidoTo buscarPorId(int id) {
		String sql = "SELECT * FROM pedidos WHERE id = ?";
		PedidoToMapper rowMapper = new PedidoToMapper();
		return plantilla.queryForObject(sql, rowMapper, id);
	}

	@Override
	public void crear(PedidoTo pto) {
		String sql = "INSERT INTO pedidos(idCliente,idProducto,unidades) VALUES (?,?,?)";
		plantilla.update(sql, pto.getIdCliente(), pto.getIdProducto(), pto.getUnidades());		
	}

	@Override
	public void actualizar(PedidoTo pto) {
		String sql = "UPDATE pedidos SET idCliente = ?, idProducto = ?,unidades = ? WHERE id = ?";
		plantilla.update(sql,pto.getIdCliente(), pto.getIdProducto(), 
							     pto.getUnidades(),pto.getId());
	}

	@Override
	public void borrar(int id) {
		String sql = "DELETE FROM pedidos WHERE id = ?";
		plantilla.update(sql, id);
		
	}

}
