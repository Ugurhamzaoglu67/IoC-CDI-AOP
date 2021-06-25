package com.godoro.cditest.interceptor;



/*1. yol -> aynı anda 2 kesme yapmak için.
@MyTraceBinding
@MyCountBinding( ascending =  true)*/

/*2. yol ->aynı anda 2 kesme yapmak için. */
@MyCombinedBinding( ascending = true)
public class MyCombinedObject {

	
	
	public String myStringOperation(String myString) {
		return "Output : "+myString;
	}
}
