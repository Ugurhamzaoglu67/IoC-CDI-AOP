package com.godoro.cditest.interceptor;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;




@Named
@RequestScoped
public class MyCountBean {
	

	@Inject
	private  MyCountAscendingObject myCountAscendingObject;
	
	@Inject
	private MyCountDescendingObject myCountDescendingObject;
	
	
	public String getAscendingValue() {
		myCountAscendingObject.myOperation("My Inputs");
		myCountAscendingObject.myOperation("My Inputs");
		myCountAscendingObject.myOperation("My Inputs");
		myCountAscendingObject.myOperation("My Inputs");
				
		return "Ben : "+myCountAscendingObject.myOperation("Inputs ");
	}
	
	
	public String getDescendingValue() {
		myCountDescendingObject.myOperation("My Inputs");
		myCountDescendingObject.myOperation("My Inputs");
		myCountDescendingObject.myOperation("My Inputs");
		myCountDescendingObject.myOperation("My Inputs");
		
		return "Bean :"+myCountDescendingObject.myOperation("My Inputs");
	}
	
}
