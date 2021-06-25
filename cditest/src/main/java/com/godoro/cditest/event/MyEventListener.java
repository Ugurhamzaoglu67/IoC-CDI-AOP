package com.godoro.cditest.event;

import javax.enterprise.event.Observes;

public class MyEventListener {
	
	// GENERAL
	public void listen(@Observes   MyEventData myEventData) {
		System.out.println("Event  "+myEventData.getMyField());
	}
	
	// LEVEL 2
	public void listen2(@Observes @MyEventQualifier(level=2) MyEventData myEventData) {
		System.out.println("Event level 2 "+myEventData.getMyField());
	}
	
	
	
}
 