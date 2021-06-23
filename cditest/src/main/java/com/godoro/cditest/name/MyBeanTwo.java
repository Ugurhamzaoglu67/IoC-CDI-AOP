package com.godoro.cditest.name;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named("kiymetlimiz")
@RequestScoped
public class MyBeanTwo {
	private String myBeanTwoProperty;

	
	public MyBeanTwo() {
		myBeanTwoProperty = "Ben Bean 2";
	}
	
	
	public String getMyBeanTwoProperty() {
		return myBeanTwoProperty;
	}

	public void setMyBeanTwoProperty(String myBeanTwoProperty) {
		this.myBeanTwoProperty = myBeanTwoProperty;
	}

}
