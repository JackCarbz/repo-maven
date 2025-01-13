
public class Calcolatrixce 
{
	public double somma(double...addendi)
	{
		double s = 0;
		for(double addendo : addendi)
		{
			if(addendo < 0)
			{
				System.out.println("addendo è negativo");
			}
			if(addendo == 0)
			{
				System.out.println("addendo è 0");
			}
			if(addendo > 0)
			{
				System.out.println("addendo è positivo");
			}
			s = s + addendo;
		}
		return s;
	}
	
	public double differenza (double d1, double d2)
	{
		double diff = 0;
		diff = d1 - d2;
		return diff;
	}
	
	public double moltiplicazione(double...addendi)
	{
		double s = 1;
		for(double addendo : addendi)
		{
			s = s * addendo;
		}
		return s;
	}
	
	public double divisione(double...addendi) throws ArithmeticException
	{
		double s = addendi[0];
		for(int i = 1; i<addendi.length; i++)
		{
			if(addendi[i] == 0)
				throw new ArithmeticException();
			s = s / addendi[i];
		}
		return s;
	}
}
