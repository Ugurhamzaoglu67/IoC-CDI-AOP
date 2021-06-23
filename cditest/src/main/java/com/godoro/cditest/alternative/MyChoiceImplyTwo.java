package com.godoro.cditest.alternative;

import javax.enterprise.inject.Alternative;



@Alternative
public class MyChoiceImplyTwo implements MyChoiceSpec{

	
	
	@Override
	public String myOperation(String input) {
		return "Gerçekştirim 2"+input;
	}

}
