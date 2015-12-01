package edu.simulation.random;

import edu.simulation.random.*;
import org.junit.Test;
import org.junit.Assert;

public class TestRandomUniform
{
	/**
	*  Test class RandomUniform
	*/

	@Test
	public void testRandomUniformCreate()
	{
		RandomUniform uniform = new RandomUniform(10, 0);
		Assert.assertNotNull(uniform);
		double random = uniform.nextDouble();
	}		
}
