package com.godoro.cditest.inject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;




@Named
@RequestScoped
public class MyConstructorBean {

	private MyTool mytool;
	
	
	@Inject
	public MyConstructorBean(MyTool mt) {
		this.mytool = mt;
		System.out.println("Araç Constructorda...");
	}
	
	public MyConstructorBean() {
		
	}
	
	
	public String getMyValue() {
		return "Tarla içitim : "+mytool.myOperation("girdi");
	}
}
