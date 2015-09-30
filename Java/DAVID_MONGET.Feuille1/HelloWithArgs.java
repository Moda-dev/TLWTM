public class HelloWithArgs
{
	// Méthode Main de la classe. Elle affiche Hello, suivi du contenu du tableau des arguments passés au moment de l'execution du 		programme.
	public static void main(String[] args)
	{
		System.out.print("Hello ");
		
		for (int i=0; i < args.length; i++)
		{
			System.out.print(args[i] + " ");
		}
		
		System.out.println("!");
	}
}
