package com.godoro.cditest.inversion;




public class MySpecificationImplementation implements MySpecification {

	
	@Override
	public String myOperationMethod(String input) {
		return "Inputumuz : "+input;
		
	}


	
}
