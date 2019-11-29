package com.qa.test;

public class TicketSystem {

	private static final String CHILD_TICKET = "This is a child ticket";

	public String getTicket(int age) {
		String result = "";
		boolean isAChild = age>=0 && age<=12;
		boolean isATeenager = age>=0 && age<=12;
		boolean isAnAdult = age>=0 && age<=12;
		boolean isAnOAP = age>=0 && age<=12;
		
		
		if(isAChild) {
			return result= CHILD_TICKET;
		}
		
		if(isATeenager) {
			result = CHILD_TICKET;
			return result;
		}
		
		if(isAChild) {
			result = CHILD_TICKET;
			return result;
		}
		
		if(isAChild) {
			result = CHILD_TICKET;
			return result;
		}
		
		else 
	}

}
