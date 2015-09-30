//Bibliothèque graphique
import javax.swing.*;

public class ExempleBoucle2
{
	
	public static void main(String[] args )
	{
		int i = 0;
		String input;
		int pos = 0;
		int neg = 0;
		
		do
		{
			//Fenêtre permettant de rentrer des données
			input = JOptionPane.showInputDialog("Donne une valeur");
			
			//Fonction transformant une chaine de caractères
			//représentant un entier par exemple "2"
			//en l'entier correspondant.
			i = Integer.parseInt(input);
			
			//Si i est positif, on incrémente le nombre de termes positifs.
			if (i > 0) 
			{
				pos ++;
			}
			//Si i est negatif, on incrémente le nombre de termes negatif.
			else if (i < 0) 
			{
				neg ++;
			}  
		}
		while ( i != 0 ); 
		
		System.out.println("Nombre de termes positifs : " + pos + ". Nombre de termes négatifs : " + neg + ".");
	}
}
