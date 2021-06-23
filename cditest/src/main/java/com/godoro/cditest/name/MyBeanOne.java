package com.godoro.cditest.name;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named
@RequestScoped
public class MyBeanOne {

	private String myBeanProperty;

	
	
	public MyBeanOne() {
		myBeanProperty = "Hello from boston";
	}
	
	
	
	public String getMyBeanProperty() {
		return myBeanProperty;
	}

	public void setMyBeanProperty(String myBeanProperty) {
		this.myBeanProperty = myBeanProperty;
	}
	
	
}
