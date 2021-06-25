package com.godoro.cditest.interceptor;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class MyCombinedBean {

	@Inject
	private MyCombinedObject myCombinedObject;
	
	
	
	
	public String getMyCombinedBeanValue() {
		return "Bean : "+myCombinedObject.myStringOperation("inject ettiğim string");
		
	}
		
}
