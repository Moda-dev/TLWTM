import javax.swing.*;
import chooser.FrameChooser;
import java.awt.*;

public class ChoixMenu
{
	public static void main(String[] args)
	{
		//entier destiné à recevoir la formule choisie par le client.
		int choix;
		//string destiné à recevoir la formule du client, avant son "parsage" en int.
		String input;
		input = JOptionPane.showInputDialog("Choisissez votre formule : \n Entrée + plat : tapez 1 \n Plat + Dessert : tapez 2 \n Entrée + Plat + Dessert : tapez 3 ");
		choix = Integer.parseInt(input);
		
		//tableau des entrées.
		String[] ent = {"Assiette de charcuterie", "Assiette de la mer", "Salade de saison"};
		//tableau des plats.
		String[] plat = {"Anguille persillée et son riz parfumé", "Entrecôte grillée et sa pomme au four", "Steak de soja pour les hippies"};
		//tableau des desserts.
		String[] des = {"Salade de fruit", "Mousse au chocolat", "Glaces", "tarte tatin"};
		
		//initialisation du framechooser.
		FrameChooser f = new FrameChooser(choix, "Menu");
		
		//remplisage du framechooser en fonction de la formule choisie par le client.
		if(choix == 1)
		{
			f.addChoicesList(ent);
			f.addChoicesList(plat);
		}
		else if ( choix == 2)
		{
			f.addChoicesList(plat);
			f.addChoicesList(des);
		}
		else
		{
			f.addChoicesList(ent);
			f.addChoicesList(plat);
			f.addChoicesList(des);
		}
		
		//choix de la plus belle couleur au monde.
		f.setBackgroundColorResult(Color.GRAY);
		f.setTextColorResult(Color.PINK);
		
		//affichage du framechooser.
		f.launch();
		
		
	}
}
