package com.godoro.cditest.scope;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@ConversationScoped
public class MyConversationScoped implements Serializable{

	private int myValue;
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private Conversation conversation;
	
		
	public String getMyValue() {
		
		return "Conversation : "+conversation.getId()+" "+myValue;
	}
	
	
	public void startOperation() {
		myValue = 10;
		conversation.begin();
		//conversation.setTimeout(60000);
	}
	
	
	public void continueOperation() {
		myValue++;
	}
	
	public void endOperation() {
		conversation.end();
		myValue = 10;
	}

	
}
