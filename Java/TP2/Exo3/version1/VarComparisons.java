import clock.model.Clock;

public class VarComparisons
{
	public static void main(String[] args)
	{
		Clock c1 = new Clock(12, 30, 00);
		Clock c2 = new Clock(12, 30, 00);
		
		int i1 = 1;
		int i2 = 1;
		
		Integer I1 = new Integer(i1);
		Integer I2 = new Integer(i2);
		
		//ici les deux instances correspondent à deux emplacement mémoires distinct
		if (c1 == c2)
		{
			System.out.println("c1 == c2");
		}
		else
		{
			System.out.println("c1 != c2");
		}
		
		//ici les variables sont identiques.
		if (i1 == i2)
		{
			System.out.println("i1 == i2");
		}
		else
		{
			System.out.println("i1 != i2");
		}
		
		//ici les deux instances correspondent à deux emplacement mémoires distinct
		if (I1 == I2)
		{
			System.out.println("I1 == I2");
		}
		else
		{
			System.out.println("I1 != I2");
		}
	}
}
