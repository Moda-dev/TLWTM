package clock.model;

public class NewClock
{
	public static void main(String[] args)
	{
		Clock c = new Clock(2, 3, 4);
		System.out.println(c.hours);
	}
}

//sans modificateurs de visibilité, aucun soucis.
//avec le modificateur public, aucun soucis. 
//en private, ça ne marche plus.
