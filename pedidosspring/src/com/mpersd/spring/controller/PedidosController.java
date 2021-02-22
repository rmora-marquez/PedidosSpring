package com.mpersd.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mpersd.spring.modelo.PedidoTo;
import com.mpersd.spring.negocio.IPedidosBo;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {

	@Autowired
	private IPedidosBo pbo;
	
	public PedidosController() {		
	}
	@RequestMapping(method=RequestMethod.GET)
	public String listaPedidosGet(ModelMap modelo){
		modelo.addAttribute("listaPedidos", pbo.todosPedidos());
		return "pedidos";
	}
	@RequestMapping(value="/detalle")
	public String detalleProducto(ModelMap modelo, @RequestParam("id") int id){
		PedidoTo pto = pbo.buscarPorId(id);
		modelo.addAttribute("pedido", pto);
		return "detallepedido";
	}
	@RequestMapping(value="/nuevo", method=RequestMethod.GET)
	public String nuevoGet(ModelMap modelo){
		PedidoTo pto = new PedidoTo(0,1,1,1);
		modelo.addAttribute("pedido", pto);
		return "formulariopedido";
	}
	
	@RequestMapping(value="/nuevo", method=RequestMethod.POST)
	public String nuevoPost(ModelMap modelo,
			@Valid @ModelAttribute("pedido") PedidoTo pto,BindingResult result){
		if(result.hasErrors()){
			return "formulariopedido";
		}
		pbo.crear(pto);
		return "redirect:/pedidos?guardado";
	}
	
	@RequestMapping(value="/editar", method=RequestMethod.GET)
	public String editarGet(ModelMap modelo, @RequestParam("id") int id){
		PedidoTo pto = pbo.buscarPorId(id);
		modelo.addAttribute("pedido", pto);
		return "formulariopedido";
	}
	@RequestMapping(value="/editar",method=RequestMethod.POST)
	public String editarPost(ModelMap modelo,
			@Valid @ModelAttribute("pedido") PedidoTo pto, BindingResult result){
		if(result.hasErrors()){
			return "formulariopedido";
		}
		pbo.actualizar(pto);
		return "redirect:/pedidos?guardado";
	}
	@RequestMapping(value="/borrar",method=RequestMethod.GET)
	public String borrarGet(ModelMap modelo, @RequestParam("id") int id){
		pbo.borrar(id);
		return "redirect:/pedidos?borrado";
	}
}
