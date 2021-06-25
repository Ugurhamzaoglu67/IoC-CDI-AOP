package com.godoro.cditest.decorator;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@RequestScoped
public class MyActualBean {

	@Inject //IoC & DI Yapısı bu. Alttaki interfaceyi implemente eden bir class bul ve getir.
	private MyActualSpec myActualSpec;
	
	
	public String getValueOne() {
		return "Bean "+myActualSpec.myOperationOne("operation 1");
	}
	
	
	
	public String getValueTwo() {
		return "Bean "+myActualSpec.myOperationTwo("operation 2");
	}
	
	
}

