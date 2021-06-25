package com.godoro.cditest.event;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class MyEventBean {

	
	
	@Inject
	private Event<MyEventData> event;		//MyEventData şeklinde event aldık.
	
	
	public void perform() {
		event.fire(new MyEventData("Genel olay..."));	//Burda o eventi, fire ettik. Yani olayı başlattık.
	}
	
}
