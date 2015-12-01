package edu.simulation.random;

import java.util.Random;

class RandomGauss extends Random
{
	private double mi;
	private double sigma;
	private double PI2 = Math.PI * 2;

	RandomGauss(double mi, double sigma)
	{
		this.mi = mi;
		this.sigma = Math.sqrt(Math.abs(sigma));
	}

	@Override
	public double nextDouble()
	{
		double a = PI2*super.nextDouble();
		double b = Math.sqrt(-2.0*Math.log(super.nextDouble()));
		return sigma*(Math.cos(a)*b) + mi;
	}
}
