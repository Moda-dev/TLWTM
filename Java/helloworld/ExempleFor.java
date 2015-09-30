//Bibliothèque graphique
import javax.swing.*;

public class ExempleFor
{
		public static void main(String[] args )
	{
		//J'initialise l'int qui recevra la taille de mon triangle.
		int t = 0;
		String input;
		String ligne = "";

		//Fenêtre permettant de rentrer des données
		input = JOptionPane.showInputDialog("Donne une valeur");
		
		//Fonction transformant une chaine de caractères
		//représentant un entier par exemple "2"
		//en l'entier correspondant.
		t = Integer.parseInt(input);
		
		for ( int i = 1; i <= t; i++ )
		{
			for ( int j = 0; j < i; j++ )
			{
				ligne = ligne + "*";
			}
			
			System.out.println(ligne);
			ligne="";
		}

		
	}
}
