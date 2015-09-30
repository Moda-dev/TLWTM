import javax.swing.*;

public class TestString
{
	//Exercice 1.a
	public static void testA()
	{
		String s = new String("Live and let die.");
		System.out.println("La longueur de la chaine est " + s.length());
		System.out.println("La première lettre de la chaine est : " + s.charAt(0));
		System.out.println("La troisième lettre de la chaine est : " + s.charAt(2));
	}
	
	//Exercice 1.b
	public static void testB()
	{
		//on demande à l'utilisateur de renseigner une phrase, et on l'affiche.
		String input;
		input = JOptionPane.showInputDialog("Votre phrase :");
		System.out.println(input);
		// on affiche la phrase de l'utilisateur, un mot par ligne.
		input = input.replace(" ","\n");
		System.out.println(input);
		// on affiche la phrase de l'utilisateur un mot par ligne, chaque mot précédé de son index dans la phrase.
		String words[] = input.split("\n");
		for(int i = 0; i < words.length; i++)
		{
			System.out.println("Mots n°" + (i+1) + " : " + words[i]);
		}
	} 
	
	public static void main(String[] args)
	{
		testA();
		testB();
	}
}
