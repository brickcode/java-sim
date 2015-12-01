package edu.simulation.model;

import edu.simulation.model.*;
import org.junit.Test;
import org.junit.Assert;

public class TestEvent
{
	/**
	*  Test class SEvent
	*/
	
	@Test
	public void createEvent()
	{
		SEvent event2 = new SEvent(new SProcess());
		Assert.assertNotNull(event2);
		Assert.assertNotNull(event2.getProcess());
		Assert.assertEquals(-1.0, event2.getTime(), 1e-15);
	}

	@Test
	public void testEventTime()
	{
		SEvent event1 = new SEvent(new SProcess());
		event1.setTime(123.45);
		Assert.assertEquals(123.45, event1.getTime(), 1e-15);
	}
}
