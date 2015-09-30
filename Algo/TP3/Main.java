import tab.Tableau;

public class Main
{

	public static void main(String[] args)
	{
		Tableau tab1 = new Tableau(6, "Tab-oulet");
		Tableau tab2 = new Tableau(6, "Tab-asco" );
		
		tab1.initialize(1, 6);
		tab2.initialize(25, 75);
		
		System.out.println(tab1);
		System.out.println(tab2);
		
		System.out.println(tab1.minimum());
		System.out.println(tab2.minimum());
		
		System.out.println(tab1.search(4));
		System.out.println(tab1.search(14));
		
		System.out.println(tab1.testTri());
		tab1.triParInsertion();
		System.out.println(tab1);
		System.out.println(tab1.testTri());
	}

}
