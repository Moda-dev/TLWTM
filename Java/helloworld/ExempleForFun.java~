//Bibliothèque graphique
import javax.swing.*;

public class ExempleFor2
{
		public static void main(String[] args )
	{
		//J'initialise l'int qui recevra la taille de mon triangle.
		int t = 0;
		//J'initialise le string qui recevra le nombre choisit par l'utilisateur
		String input;
		//J'initialise le string qui recevra les lignes à afficher, sauf la dernière.
		String ligne = "";
		//J'initialise le string qui recevra la dernière ligne à afficher. 
		String derniereLigne="*";

		//Fenêtre permettant de rentrer des données
		input = JOptionPane.showInputDialog("Donne une valeur");
		
		//Fonction transformant une chaine de caractères
		//représentant un entier par exemple "2"
		//en l'entier correspondant.
		t = Integer.parseInt(input);
		
		
		for ( int i = 1; i < t; i++ )
		{
			for ( int j = 0; j < i; j++ )
			{
				//si l'on se trouve en début ou en fin de ligne, on ajoute une étoile
				if (j == 0 || j == (i-1) )
				{
					ligne = ligne + "*";
				}
				//si l'on se trouve en milieu de ligne, on ajoute un espace
				else
				{
					ligne = ligne + " ";
				}
			}
			//on affiche la ligne générée par la boule for.
			System.out.println(ligne);
			// on vide la ligne pour en regénérer une nouvelle.
			ligne="";
			// on étend là longueur de la derniere ligne.
			derniereLigne += "*";
		}
		//on affihe la derniere ligne.
		System.out.println(derniereLigne);		
	}
}
