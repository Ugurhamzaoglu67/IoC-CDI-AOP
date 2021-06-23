package com.godoro.cditest.inject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@RequestScoped
public class MyFieldBean {

	
	
	@Inject
	private MyTool myTool;
	
	
	public String getMyValue() {
		return "Field  :  "+myTool.myOperation("Girdi");
	}
}
