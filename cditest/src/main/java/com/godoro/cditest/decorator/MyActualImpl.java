package com.godoro.cditest.decorator;




public class MyActualImpl implements MyActualSpec {

	@Override
	public String myOperationOne(String myInput) {
		return "Output 1 : "+myInput;
	}

	@Override
	public String myOperationTwo(String myInput) {
		return "Output 2 : "+myInput;
	}	
}
