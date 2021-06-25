package com.godoro.cditest.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;




@Decorator
abstract public class MyActualDecorator implements MyActualSpec {

	
	private @Inject @Delegate MyActualSpec myActualSpec;
	
	
	@Override
	public String myOperationOne(String myInput) {
		System.out.println("Decorator çalıştı...");
		String output = myActualSpec.myOperationOne(myInput);
				
		if(myInput.contains("operation 1")) {
			output = output.replace("operation 1", "operation 1 hello...");
		}
		
		
		return output;		
	}



}
