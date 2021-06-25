package com.godoro.cditest.event;

import javax.enterprise.event.Observes;

public class MyEventListener {
	
	
	public void listen(@Observes   MyEventData myEventData) {
		System.out.println("Event  "+myEventData.getMyField());
	}

}
 