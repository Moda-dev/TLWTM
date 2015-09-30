//Bibliothèque graphique
import javax.swing.*;

public class ExempleBoucle
{
	
	public static void main(String[] args )
	{
		int i = 0;
		String input;
		int somme = 0;
		int cpt = 0;
		
		do
		{
			//Fenêtre permettant de rentrer des données
			input = JOptionPane.showInputDialog("Donne une valeur");
			
			//Fonction transformant une chaine de caractères
			//représentant un entier par exemple "2"
			//en l'entier correspondant.
			
			i = Integer.parseInt(input);
			somme += i;
			if (i != 0) 
			{
				cpt++;
			} 
		}
		while ( i >= 0 ); 
		
		System.out.println("J'ai calculé 2 valeurs : " + cpt + " et " + somme + ".");
	}
}
