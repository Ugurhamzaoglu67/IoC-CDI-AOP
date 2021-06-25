package com.godoro.cditest.interceptor;




@MyCountBinding ( ascending = true)
public class MyCountAscendingObject {

	
	public String myOperation(String input) {
		return "Artan "+input;
	}
}
