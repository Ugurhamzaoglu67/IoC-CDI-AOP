package com.godoro.cditest.interceptor;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;





@Named
@RequestScoped
public class MyTraceBean {

	@Inject
	private MyTraceObject myTraceObject; //Burda asıl sınıf değil, vekillik var.
	
	
	
	public String getMyStr() {
		return "Bean : "+myTraceObject.myOperation("Hello");
	}
	
	
}
