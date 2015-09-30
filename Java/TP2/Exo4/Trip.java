import javax.swing.*;
import trip.*;

public class Trip
{
    public static void main(String[] args)
    {
	Leprechaun johnDoe = new Leprechaun();
	String name = JOptionPane.showInputDialog("What is your name ?");
	String position = JOptionPane.showInputDialog("What is your position ? X Y");
	Position p = new Position(position);
	Leprechaun l = new Leprechaun(name, p);

	System.out.println("Moi "
			   + l.getName() 
			   + " suis en position " 
			   + l.getPosition()
			   + " je regarde vers "
			   + l.getDirection());
	System.out.println("Lui "
			   + johnDoe.getName()
			   + " est en position " 
			   + johnDoe.getPosition()
			   + " je regarde vers "
			   + johnDoe.getDirection());

	System.out.println("le voyage commence");
	int step;
	String msg = "How many steps do you want to make ?";
	do{
	    step = Integer.parseInt(JOptionPane.showInputDialog(msg));
	    l.avance(step);
	    l.turn();
	    johnDoe.avance();
	    johnDoe.turn();
	} while (step > 0);

	System.out.println("Moi "
			   + l.getName() 
			   + " suis en position " 
			   + l.getPosition());
	System.out.println("Lui "
			   + johnDoe.getName()
			   + " est en position " 
			   + johnDoe.getPosition());
	System.out.println(johnDoe);
	System.out.println(l);
    }
}
