import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestCalcolatrice {

	@Test
	public void testSomma() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(5,6);
		
		Assert.assertEquals(11,res,0);
	}
	
	@Test
	public void testSomma2() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(6,6);
		
		Assert.assertEquals(12,res,0);
	}
	
	@Test
	public void testSommaNegativo() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(10,-5);
		
		Assert.assertEquals(5,res,0);
	}
}
