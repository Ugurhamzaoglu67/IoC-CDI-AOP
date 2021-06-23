package com.godoro.cditest.qualifier;

import javax.enterprise.inject.Default;

@Default
public class MyOptionImplZeroDef implements MyOptionSpec {

	
	
	@Override
	public String myOperation(String mystr) {
		return "MyImplement 0 Default "+mystr;
	}

}
