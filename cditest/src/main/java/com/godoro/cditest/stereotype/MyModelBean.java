package com.godoro.cditest.stereotype;

import javax.enterprise.inject.Model;



@Model
public class MyModelBean {

	
	public String myVal() {
		return "Model Bean "+hashCode(); //@RequestScoped olduğundan her çağırdığında değişir.
	}
}
