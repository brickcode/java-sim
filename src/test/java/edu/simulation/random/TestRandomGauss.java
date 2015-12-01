package edu.simulation.random;

import edu.simulation.random.*;
import org.junit.Test;
import org.junit.Assert;

public class TestRandomGauss
{
	/**
	*  Test class RandomGauss
	*/

	@Test
	public void testRandomGaussCreate()
	{
		RandomGauss gauss = new RandomGauss(0, 1);
		Assert.assertNotNull(gauss);
		double random = gauss.nextDouble();
	}		
}
