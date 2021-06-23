package com.godoro.cditest.inversion;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class MySpecificationBean {

	@Inject
	private MySpecification mySpecification;
	
	
	public String getMyValue() {
		return mySpecification.myOperationMethod(" Girdimiz bu");
	}
}
