package trip;

/**
*
* Leprechaun class is used to represent a Leprechaun 
* caracterized by its name, position, and facing direction. 
* His rank is also defined.
*
* @author DMonget
*
*/

public class Leprechaun
{

	private static final int NORD = 0;
	private static final int OUEST = 1 ;
	private static final int SUD = 2 ;
	private static final int EST = 3 ;
	
	private static int nbLeprechaun = 0;
	private int rang;
	
	private String name;
	private Position position;
	private int direction;
	
	/**
	* constructs a leprechaun whose name is nobody,
	* position is 0,0, and is facing the NORD direction.
	*/
	public Leprechaun()
	{
		this.name = "nobody";
		this.position = new Position(0, 0);
		this.direction = NORD;
		
		this.rang = Leprechaun.nbLeprechaun;
		Leprechaun.nbLeprechaun++;
	}
	
	/**
	* constructs a leprechaun whose name is name,
	* position is p, and is facing to the NORD direction.
	* @param name a String containing the Leprechaun's name.
	* @param p a valid Position object.
	*/
	public Leprechaun( String name, Position p)
	{
		this.name = name;
		this.position = p;
		this.direction = NORD;
		
		this.rang = Leprechaun.nbLeprechaun;
		Leprechaun.nbLeprechaun++;
	}
	
	/**
	* @return the name of the Leprechaun.
	*/
	public String getName()
	{
		return this.name;
	}
	
	/**
	* @return the direction the Leprechaun is facing.
	*/
	public String getDirection()
	{
		String result = "";
		
		switch (this.direction) {
			case NORD:  result = "NORD";
			     break;
			case EST:  result =  "EST";
			     break;
			case SUD:  result =  "SUD";
			     break;
			case OUEST:  result =  "OUEST";
			     break;
		}
		
		return result;
	}
	
	/**
	* @return the position of the Leprechaun.
	*/
	public Position getPosition()
	{
		return this.position;
	}
	
	/**
	* Modifies the position of the Leprechaun 
	* using the specified number of steps,
	* and the direction the Leprechaun is facing.
	* @param nbPas the number of steps to be taken 
	* in the direction the leprechaun is facing.
	*/
	public void avance(int nbPas )
	{
		switch (this.direction) {
			case NORD:  this.position.setY( this.position.getY() + nbPas );
			     break;
			case EST:  this.position.setX( this.position.getX() + nbPas );
			     break;
			case SUD:  this.position.setY( this.position.getY() - nbPas );
			     break;
			case OUEST:  this.position.setX( this.position.getX() - nbPas );
			     break;
		}
	}
	
	/**
	* Modifies the position of the Leprechaun by one steps 
	* in the direction the Leprechaun is facing.
	*/
	public void avance()
	{
		switch (this.direction) {
			case NORD:  this.position.setY( this.position.getY() + 1 );
			     break;
			case EST:  this.position.setX( this.position.getX() + 1 );
			     break;
			case SUD:  this.position.setY( this.position.getY() - 1 );
			     break;
			case OUEST:  this.position.setX( this.position.getX() - 1 );
			     break;
		}
	}
	
	/**
	* Modifies the direction the Leprechaun is facing, 
	* following an anti-clockwise pattern.
	* e.g. a NORD facing Leprechaun will be facing OUEST
	* after the method is called.
	*/
	public void turn()
	{
		switch (this.direction) {
			case NORD:  this.direction = OUEST;
			     break;
			case EST:  this.direction = NORD;
			     break;
			case SUD:  this.direction = EST;
			     break;
			case OUEST:  this.direction = SUD;
			     break;
		}
	}

	/**
	* @return a string representing the object 
	* The new representation looks like :
	* Name => name.
	* Rang => rank.
	* Position => pos.
	* Direction => dir.
	*/
	@Override
	public String toString()
	{
		return "Name => " + this.name + ".\n Rang => " + this.rang + ".\n Position => " + this.position + ".\n Direction => " + this.getDirection() + ".\n";
	}
}
