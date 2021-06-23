package com.godoro.cditest.qualifier;


@MyOption(MyOptionType.TWO)  //Tip verdiğimiz için Burda Kullanmak zorundayız.
public class MyOptionImplTwo implements MyOptionSpec{

	@Override
	public String myOperation(String mystr) {
		return "Implement Two "+mystr+" ";
	}

}
