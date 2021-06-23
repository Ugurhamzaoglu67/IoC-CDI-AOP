package com.godoro.cditest.qualifier;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class MyOptionBean {

	@Inject  @MyOption(MyOptionType.THREE)  //@MyOption ile işaretlenmiş olsun, üstelik tipide THREE olanı git bul dedik.
	private MyOptionSpec myOptionSpec;
	
	
	public String getMyStr() {
		
		return "Output : "+myOptionSpec.myOperation("my Input");
	}
	
}
