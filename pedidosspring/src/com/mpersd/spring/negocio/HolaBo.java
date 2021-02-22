package com.mpersd.spring.negocio;

public class HolaBo implements IHolaBo {

	public HolaBo() {
		this.hello();
	}

	@Override
	public void hello() {
		System.out.println("Mi primera aplicacion Spring");
	}

}
