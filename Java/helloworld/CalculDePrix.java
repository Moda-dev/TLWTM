public class CalculDePrix
{
	
	public static void main(String[] args)
	{
		//on transforme en int la valeure passée en paramètre.
		int i = Integer.parseInt(args[0]);
		
		//on créé le double qui accueillera le résultat final.
		double d = 0;
		
		//Si le prix est supérieur ou égale à 1000
		if( i >= 1000 )
		{
			/*on applique 2% de réduction à partir du centième euro, puis 5% à partir du cinq centième, puis 7% à partir du 			millième*/
			d = 99 + 400*0.98 + 500*0.95 + (i-999)*0.93;
		}
		//Si le prix est supérieur ou égale à 500
		else if ( i >= 500 ) 
		{
			//on applique 2% de réduction à partir du centième euro, puis 5% à partir du cinq centième.
			d = 99 + 400*0.98 + (i-499)*0.95;
		}
		//Si le prix est supérieur ou égale à 100
		else if ( i >= 100 )
		{
			//on applique 2% de réduction à partir du centième euro.
			d = 99 + (i-99)*0.98;
		}
		
		System.out.println(d);	
		
	}
}
