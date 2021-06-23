package com.godoro.cditest.scope;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class MyRequestBean {

	@Inject
	private MyDependentBean myDependentBean;
	
	
	
	public String getMyValue() {
		return "Request : "+hashCode();
	}
	
	
	public String getDependentValue() {
		return "Request: "+myDependentBean.getValue();
	}
	
	
}
