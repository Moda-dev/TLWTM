import clock.model.*;

public class NewClock
{
	public static void main(String[] args)
	{
		Clock c = new Clock(2, 3, 4);
		System.out.println(c.hours);
	}
}

//sans modificateurs de visibilité dans la class clock.model.Clock, ça ne marche pas.
//avec le modificateur public, ça marche.
//et en private, ça ne fonctionne plus.
