package edu.simulation.model;

import edu.simulation.model.SEvent;

public class SProcess
{
	private boolean terminated;
	private int phase;
	private SEvent myEvent;

	SProcess()
	{
		this.phase = 0;
		this.terminated = false;
		this.myEvent = new SEvent(this);
	}

	public void execute() {}
	public void activate() {}

	public void setPhase(int phase)
	{
		this.phase = phase;
	}

	public int getPhase()
	{
		return this.phase;
	}

	public void setTerminated()
	{
		this.terminated = true;
	}

	public boolean isTerminated()
	{
		return this.terminated;
	}

	public SEvent getEvent()
	{
		return this.myEvent;
	}
}
