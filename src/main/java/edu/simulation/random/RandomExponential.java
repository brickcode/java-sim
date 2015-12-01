package edu.simulation.random;

import java.util.Random;

class RandomExponential extends Random
{
	private double mi;

	RandomExponential(double mi)
	{
		this.mi = mi;
	}

	@Override
	public double nextDouble()
	{
		return -mi * Math.log(super.nextDouble()); 
	}
}
