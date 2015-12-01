package edu.simulation.random;

import edu.simulation.random.*;
import org.junit.Test;
import org.junit.Assert;

public class TestRandomExponential
{
	/**
	*  Test class RandomUniform
	*/

	@Test
	public void testRandomExponentialCreate()
	{
		RandomExponential expo= new RandomExponential(10);
		Assert.assertNotNull(expo);
		double random = expo.nextDouble();
	}		
}
