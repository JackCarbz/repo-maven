
public class Calcolatrixce 
{
	public double somma(double...addendi)
	{
		double s = 0;
		for(double addendo : addendi)
		{
			s = s + addendo;
		}
		return s;
	}
	
	public double sottrazione(double...addendi)
	{
		double s = addendi[0];
		for(int i = 1; i<addendi.length; i++)
		{
			s = s - addendi[i];
		}
		return s;
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
