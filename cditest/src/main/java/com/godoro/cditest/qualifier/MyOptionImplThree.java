package com.godoro.cditest.qualifier;





@MyOption(MyOptionType.THREE)
public class MyOptionImplThree implements MyOptionSpec{

	@Override
	public String myOperation(String mystr) {
		return "Implement Three "+mystr+" ";
	}

}
