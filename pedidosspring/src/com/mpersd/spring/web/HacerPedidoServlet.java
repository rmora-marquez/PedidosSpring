package com.mpersd.spring.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mpersd.spring.negocio.IPedidosBo;

@WebServlet("/hacerpedido")
public class HacerPedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HacerPedidoServlet() {
        super();
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCliente= new Integer(request.getParameter("idCliente"));
		int idProducto= new Integer(request.getParameter("idProducto"));
		int unidades= new Integer(request.getParameter("unidades"));
		WebApplicationContext ctx = WebApplicationContextUtils.
				getWebApplicationContext(getServletContext());
		IPedidosBo pbo = ctx.getBean(IPedidosBo.class);
		
		pbo.insertarPedido(idCliente, idProducto, unidades);
		
		response.getWriter().append("pedido guardado " + unidades);
	}

}
