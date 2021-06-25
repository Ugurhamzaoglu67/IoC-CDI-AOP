package com.godoro.cditest.stereotype;


/*
@Named
@ApplicationScoped
@MyCombinedBinding(ascending = false)
@MyTraceBinding

Tüm bunların yerine tek bir anatasyon -> @MyStereotypeBeanAnnotation
  */

@MyStereotypeBeanAnnotation
public class MyStereotypeBean {

	
	
	public String getMyValueString() {
		return "Bean "+hashCode(); //hashCode() hep aynı değeri basıyorsa, @ApplicationScoped -> çalışıyordur demek.
	}
}
