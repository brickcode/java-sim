package edu.simulation.model;

import edu.simulation.model.SProcess;

public class SEvent
{
	private double eventTime;
	private SProcess proc;

	SEvent(SProcess proc)
	{
		this.proc = proc;
		this.eventTime = -1;
	}

	public void setTime(double time)
	{
		this.eventTime = time;
	}

	public double getTime()
	{
		return this.eventTime;
	}

	public SProcess getProcess()
	{
		return this.proc;
	}

	public boolean compare(SEvent event)
	{
		return this.getTime() < event.getTime();
	}
}
