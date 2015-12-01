package edu.simulation.random;

import java.util.Random;

class RandomUniform extends Random
{
	private double up;
	private double down;

	RandomUniform(double up, double down)
	{
		this.up = up;
		this.down = down;
	}

	@Override
	public double nextDouble()
	{
		return super.nextDouble()*(up-down)+down;
	}
}

