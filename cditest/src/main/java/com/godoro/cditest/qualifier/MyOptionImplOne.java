package com.godoro.cditest.qualifier;



@MyOption(MyOptionType.ONE)  //Tip verdiğimiz için Burda Kullanmak zorundayız.
public class MyOptionImplOne implements MyOptionSpec{

	@Override
	public String myOperation(String mystr) {
		return "Implement 1 "+mystr+" ";
	}

}
