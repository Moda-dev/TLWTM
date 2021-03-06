package tab;

import java.util.Random;


public class Tableau
{
	private static Random LUCKY = new Random();

	private int[] tab;
	private String nom;
	
	public Tableau( int i, String s)
	{
		this.tab = new int[i];
		this.nom = s;
	}
	
	public void initialize(int min, int max)
	{
		for(int i = 0; i < this.tab.length ; i++)
		{
			this.tab[i] =  min + LUCKY.nextInt(max-min);
			
		}
	}
	
	public int minimum()
	{
		int minimum = tab[0];
		
		for(int i = 1; i < this.tab.length ; i++)
		{
			if ( this.tab[i] < minimum )
			{
				minimum = this.tab[i];
			}
			
		}
		
		return minimum;
	}
	
	public int minimumTrié()
	{
		return 0;
	}
	
	
	
	public int search(int value)
	{
		int result = -1;
		
		for(int i = 0; i < this.tab.length ; i++)
		{
			if ( this.tab[i] == value )
			{
				result = i;
			}
			
		}
		
		return result;
	}
	
	public void triParInsertion()
	{
		int temp = 0;
		
		for(int i = 0; i < this.tab.length; i++)
		{
			for(int j = i; j < this.tab.length; j++)
			{
				if( this.tab[j] < this.tab[i] )
				{
					temp = this.tab[i];
					this.tab[i] = this.tab[j];
					this.tab[j] = temp;
				}
			}
		}
	}
	
	public boolean testTri()
	{
		boolean result = true;
		
		for(int i = 1; i < this.tab.length; i++)
		{
			if (this.tab[i] < this.tab[i-1])
			{
				result = false;
			}
		}
		return result;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		
		result += "Tableau : " + this.nom + "\n";
		result += " '-> Taille : " + this.tab.length + "\n";
		result += " '-> Valeurs : { ";
		
		for(int i = 0; i < this.tab.length ; i++)
		{
			result += this.tab[i] + ", ";
		}
		
		result += "}";
		
		return result;
		
	}
	
	
}
