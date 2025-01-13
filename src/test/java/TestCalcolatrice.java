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
		
		double res = c.somma(2,0);
		
		assertEquals(2,res,0);
	}
	
	@Test
	public void testSomma3() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.somma(2,-1);
		
		assertEquals(1,res,0);
	}
	
	@Test
	public void testDifferenza() 
	{
		Calcolatrixce c = new Calcolatrixce();
		
		double res = c.differenza(5,2);
		
		assertEquals(3,res,0);
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
