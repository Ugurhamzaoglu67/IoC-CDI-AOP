package com.godoro.cditest.alternative;

import javax.enterprise.inject.Alternative;




@Alternative
public class MyChoiceImplyOne implements MyChoiceSpec{

	
	
	@Override
	public String myOperation(String input) {
		return "Gerçekştirim 1"+input;
	}

}
