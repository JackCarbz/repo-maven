import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcolatrice {

	@Test
	public void testSomma() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(5,6);
		
		assertEquals(11,res,0);
	}
	
	@Test
	public void testSomma2() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(6,6);
		
		assertEquals(12,res,0);
	}
	
	@Test
	public void testSommaNegativo() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(10,-5);
		
		assertEquals(5,res,0);
	}
	
	@Test
	public void testSottra()
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.sottrazione(10,5);
		
		assertEquals(5,res,0);
	}
	
	@Test
	public void testMolti()
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.moltiplicazione(3, 4, 2);
		
		assertEquals(24,res,0);
	}
	
	@Test
	public void testDivi()
	{
		Calcolatrixce c = new Calcolatrixce();
		try
		{
			double res = c.divisione(12, 4);
			assertEquals(3,res,0);
		}
		catch(ArithmeticException eccezione)
		{
			System.out.println("errore, eccezione lanciata");
		}
	}
}
