package com.godoro.cditest.alternative;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class MyChoiceBean {
	
	@Inject
	private MyChoiceSpec myChoiceSpec;
	
	
	
	public String getMyValue() {
		return "Output "+myChoiceSpec.myOperation("Input");
	}
	
	
}
