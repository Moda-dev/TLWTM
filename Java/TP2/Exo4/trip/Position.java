package trip;

/**
 *
 * Position class is used to represent a position 
 * and its coordinates using a simple x/y notation.
 * 
 *
 * @author DMonget
 *
 */
public class Position
{
	private int x;
	private int y;
	
	/**
	* constructs a position whose coordinates are 0/0
	*/
	public Position()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	* constructs a position whose coordinates are x/y.
	* @param x the X axis value
	* @param y the Y axis value
	*/
	public Position( int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	* constructs a position whose coordinates are x/y.
	* @param position a string containing x and y 
	* separated by an undetermined number of blank spaces.
	*/
	public Position(String position)
	{
		String[] pos = position.split(" +");
		this.x = Integer.parseInt(pos[0]);
		this.y = Integer.parseInt(pos[1]);
	}
	/**
	* @return the X axis value
	*/
	public int getX()
	{
		return this.x;
	}
	/**
	* @return the Y axis value
	*/
	public int getY()
	{
		return this.y;
	}
	/**
	* sets the X axis value
	*/	
	public void setX( int x )
	{
		this.x = x;
	}
	/**
	* sets the Y axis value
	*/	
	public void setY( int y)
	{
		this.y = y;
	}
	
	
	/**
	*  @return a string representing the object 
	*  it looks like "X = x; Y = y"
	*/
	@Override
	public String toString()
	{
		return "X = " + this.x + "; Y = " + this.y;
	}
}
