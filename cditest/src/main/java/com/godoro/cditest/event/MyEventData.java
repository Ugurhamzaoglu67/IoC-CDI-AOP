package com.godoro.cditest.event;





public class MyEventData {

	private String myField;

	
	
	public MyEventData() {
		
	}
	
	public MyEventData(String myField) {
		this.myField = myField;
	}

	
	public String getMyField() {
		return myField;
	}

	public void setMyField(String myField) {
		this.myField = myField;
	}
	
	
	
}
