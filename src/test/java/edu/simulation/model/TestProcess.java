package edu.simulation.model;

import edu.simulation.model.*;
import org.junit.Test;
import org.junit.Assert;

public class TestProcess
{
	/**
	*  Test class SProcess
	*/

	@Test
	public void createProcess()
	{
		SProcess proc = new SProcess();
		Assert.assertNotNull(proc);
		Assert.assertEquals(0, proc.getPhase());
		Assert.assertEquals(false, proc.isTerminated());
	}

	@Test
	public void testProcessPhase()
	{
		SProcess proc1 = new SProcess();
		proc1.setPhase(1); 
		Assert.assertEquals(1, proc1.getPhase());
		proc1.setPhase(0); 
		Assert.assertEquals(0, proc1.getPhase());
	}
	
	@Test
	public void testProcessTerminated()
	{
		SProcess proc1 = new SProcess();
		proc1.setTerminated(); 
		Assert.assertEquals(true, proc1.isTerminated());
	}

	@Test
	public void testProcessEvent()
	{
		SProcess proc1 = new SProcess();
		proc1.activate(); 
		Assert.assertNotNull(proc1.getEvent());
		Assert.assertEquals(-1.0, proc1.getEvent().getTime(),1e-15);
		Assert.assertEquals(proc1, proc1.getEvent().getProcess());
	}

	@Test
	public void testProcessActivate()
	{
		SProcess proc1 = new SProcess();
		proc1.activate(); 
	}

	@Test
	public void testProcessExecute()
	{
		SProcess proc1 = new SProcess();
		proc1.execute(); 
	}
}
