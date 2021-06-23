package com.godoro.cditest.scope;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ApplicationScoped
public class MyApplicationBean {

	@Inject
	private MyDependentBean myDependentBean;
	
	
	public String getMyValue() {
		return "Application : "+hashCode();
	}
	
	
	public String getDependentValue() {
		return "Application : "+myDependentBean.getValue();
	}
	
}
