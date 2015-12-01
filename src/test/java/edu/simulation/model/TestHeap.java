package edu.simulation.model;

import edu.simulation.model.*;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class TestHeap
{
	private double DELTA = 1e-15;
	/**
	*  Test class SHeap
	*/
	
	@Test
	public void testHeapCreate()
	{
		SHeap heap = new SHeap();
		Assert.assertNotNull(heap);
		Assert.assertEquals(0, heap.getSize());
		SEvent event = heap.first();
		Assert.assertNull(event);
	}

	@Test
	public void testHeapFirst()
	{
		SHeap heap = new SHeap();
		Assert.assertNotNull(heap);
		SProcess proc = new SProcess();
		proc.getEvent().setTime(5.3);
		heap.schedule(proc.getEvent());

		Assert.assertEquals(1, heap.getSize());
		SEvent eventHeap = heap.first();
		Assert.assertEquals(proc.getEvent(), eventHeap);
		Assert.assertEquals(5.3, eventHeap.getTime(), DELTA);
	}

	@Test
	public void testHeapSchedule()
	{
		SHeap heap = new SHeap();
		int SIZE = 10;	
		for(int i=0; i < SIZE; i++)
		{
			SProcess proc = new SProcess();
			double time = 10-i;
			proc.getEvent().setTime(time);
			heap.schedule(proc.getEvent());
		}
			
		double[] testValues = {1, 2, 5, 4, 3, 9, 6, 10, 7, 8};
		for(int i=0; i < SIZE; i++)
		{
			Assert.assertEquals(testValues[i], heap.get(i).getTime(), DELTA);
		}
	}
	
	@Test
	public void testHeapRemove()
	{
		SHeap heap = new SHeap();
		int SIZE = 10;	
		for(int i=0; i < SIZE; i++)
		{
			SProcess proc = new SProcess();
			double time = 10-i;
			proc.getEvent().setTime(time);
			heap.schedule(proc.getEvent());
		}
			
		for(int i=0; i < SIZE; i++)
		{
			SEvent event = heap.first();
			Assert.assertEquals(i+1, event.getTime(), DELTA);
		}
	}
	
	@Test
	public void testHeapPlace()
	{
		SHeap heap = new SHeap();
		Assert.assertNotNull(heap);
		
		SProcess proc1 = new SProcess();
		proc1.getEvent().setTime(5.3);
		proc1.setTerminated();
		heap.schedule(proc1.getEvent());
		
		SProcess proc2 = new SProcess();
		proc2.getEvent().setTime(5.3);
		heap.schedule(proc2.getEvent());

		boolean bool1 = heap.first().getProcess().isTerminated();
		boolean bool2 = heap.first().getProcess().isTerminated();
		Assert.assertEquals(true, bool1);
		Assert.assertEquals(false, bool2);
		Assert.assertEquals(0, heap.getSize());
	}
}
