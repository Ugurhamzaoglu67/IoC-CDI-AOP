package com.godoro.cditest.produce;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;




public class MyProducerBean {

	
	@Produces
	public List<String> getMyList(){
		List<String> myList = new ArrayList<String>();
		myList.add("öğe 1");
		myList.add("öğe 2");
		myList.add("öğe 3");
		myList.add("öğe 4");
		
		return myList;
	}
	
	
	 @Produces
	public String[] myArray(@New MyParameter myParameter) {
		
		 String[] myArray = new String[myParameter.getLength()];
		 for(int i=0 ; i < myArray.length ; i++) {
			 
			 myArray[i] ="Madde "+(i+1);
		 }
		 
		 return myArray;
		 
	}
	
}


