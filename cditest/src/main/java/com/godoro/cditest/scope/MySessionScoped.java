package com.godoro.cditest.scope;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@SessionScoped
public class MySessionScoped implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private MyDependentBean myDependentBean;
	
	
	public String getMyValue() {
		return "Session : "+hashCode();
	}
	
	
	public String getDependentValue() {
		return "Session : "+myDependentBean.getValue();
	}
	
	
	
	
}


