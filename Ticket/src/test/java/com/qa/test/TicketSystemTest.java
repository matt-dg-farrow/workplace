package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TicketSystemTest {

	@Test
	public void testChildTicket() {
		TicketSystem ticketSystem = new TicketSystem();
		String childTicket1 = ticketSystem.getTicket(0);
		String childTicket2 = ticketSystem.getTicket(12);
		String childTicket3 = ticketSystem.getTicket(6);
		
		Assert.assertEquals(,)
	}

}
