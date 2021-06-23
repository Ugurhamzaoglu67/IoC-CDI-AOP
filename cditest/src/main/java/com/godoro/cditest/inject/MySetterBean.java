package com.godoro.cditest.inject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@RequestScoped
public class MySetterBean {
	
	
	private MyTool tool;
	

	
	@Inject
	public void setMyValue(MyTool tool){
		this.tool = tool;
		System.out.println("Araç Takıldı..");
	}
	
	
	public String getMyValue() {
		return "Setter Tarla "+tool.myOperation(" selam");
	}
}
