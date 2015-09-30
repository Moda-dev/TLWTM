public class ExempleHMS
{
	public static void display1MoreSecond( int h, int m, int s)
	{
		// on s'assure que les 3 nombres passés en paramètres représentent bien une heure plausible.	
		if(h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s <60)
		{
			s++;
			
			//Si les secondes atteignent 60, on ajoute une minute.
			if( s > 59)
			{
				m++;
				s = 0;
				
				//Si les minutes atteignent 60, on ajoute une heure.
				if( m > 59)
				{
					h++;
					m = 0;
					
					//si les heures atteignent 24, on commence une nouvelle journée ( 00:00:00 ).
					if ( h > 23 )
					{
						h = 0;
						m = 0;
						s = 0;
					}
				} 
				
			}
			//on affiche l'heure à l'écran, au format hh:mm:ss
			System.out.printf("%02d:%02d:%02d\n", h, m, s);
		}
		//Si les nombres passés en paramètres de représentent pas une heure plausible, alors on affiche le message suivant.
		else
		{
			System.out.println("Merci de renseigner une heure valide.");
		}	
	}
	
	public static void main(String[] args)
	{
		display1MoreSecond(10, 54, 20);
		display1MoreSecond(10, 54, 59);
		display1MoreSecond(10, 59, 59);
		display1MoreSecond(23, 59, 59);
		display1MoreSecond(45, 76, 53);
	}
}
