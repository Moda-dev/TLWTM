public class ExempleSwitch
{
	public static void main(String[] args)
	{		
		try
		{
			//si le paramètre est un entier, alors il est stocké dans i.
			int i = Integer.parseInt(args[0]);
			
			//Si i est compris entre 0 et 6, alors on affiche le jour de la semaine qui lui est associé. 
			if ( i >= 0 && i <= 6 )
			{
				switch (i)
				{
					case 0 : System.out.println("Dimanche"); break;
					case 1 : System.out.println("Lundi"); break;
					case 2 : System.out.println("Mardi"); break;
					case 3 : System.out.println("Mercredi"); break;
					case 4 : System.out.println("Jeudi"); break;
					case 5 : System.out.println("Vendredi"); break;
					case 6 : System.out.println("Samedi"); break;
				
				}
			}	
			else
			{
				//Si i n'est pas compris entre 0 et 6 alors on affiche le message suivant.
				System.out.println("Merci de renseigner un nombre compris entre 0 et 6");
			}
			
		}
		catch (Exception e)
		{
			//si le paramère n'est pas un entier, le message d'erreur suivant est affiché.
			System.out.println("Merci de renseigner un nombre. Il doit être compris entre 0 et 6");
		}
		
	}
}
