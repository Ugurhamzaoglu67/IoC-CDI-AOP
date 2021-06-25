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
	
	@Inject
	private @MyEventQualifier(level=2) Event<MyEventData> event2;
	
	@Inject
	private @MyEventQualifier(level=4) Event<MyEventData>	event4;
	
	public void perform() {
		event.fire(new MyEventData("Genel event..."));	//Burda o eventi, fire ettik. Yani olayı başlattık.
	
		event2.fire(new MyEventData("event 2 ....")); //Fırlattım  -> MyEventListener'da yakala.
		
		event4.fire(new MyEventData("event 4...."));
		
		
		event.select(new MyEventQualifierLiteral(2))
			 .fire(new MyEventData(" Qualifier event 2 ...."));
	}
	
}
