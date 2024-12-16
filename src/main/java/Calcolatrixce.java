
public class Calcolatrixce 
{
	public double somma(double...addendi)
	{
		double s = 0;
		for(double addendo : addendi)
		{
			s = s + Math.abs(addendo);
		}
		return s;
	}
}
