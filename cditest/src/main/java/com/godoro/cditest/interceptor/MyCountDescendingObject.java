package com.godoro.cditest.interceptor;





@MyCountBinding ( ascending = false)
public class MyCountDescendingObject {

	
	public String myOperation(String input) {
		return "Azalan "+input;
	}
}
