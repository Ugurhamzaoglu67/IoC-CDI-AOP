package com.godoro.cditest.interceptor;


@MyTraceBinding		//İşaretleyecek olan ise, Bizim bu nesnemiz. İzlenen, yolu kesilen nesne bu şekilde izin veriyor.
public class MyTraceObject {

	
	
	public String myOperation(String myStr) {
		return "My Str : "+myStr;
	}
}
