/**
*
* ChangingTwoColors is a class encapsuling two Color objects,
* a main one, and an alternate one. At any given moment, it knows which is which
* and is capable of switching them around.
*
* @author DMonget
*
*/

public class ChangingTwoColors
{
	private Color main;
	private Color alternate;
	
	
	/**
	* Contructs a ChangingTwoColors object, setting Color one as the main Color,
	* and Color two as the alternate Color.
	*
	*@param one a valid Color object.
	*@param two a valid Color object.
	*/
	public ChangingTwoColors(Color one, Color two)
	{
		this.main = one;
		this.alternate = two;
	}
	/**
	* Sets the colors of the current ChangingTwoColors Object to the colors passed as parameters.
	* Color one replaces the main Color, and Color two replaces the alternate Color.
	*
	*@param one a valid Color object.
	*@param two a valid Color object. 
	*/
	public void setColors( Color one, Color two)
	{
		this.main = one;
		this.alternate = two;
	}
	
	/**
	*@return The main Color of the current ChangingTwoColors object.
	*/
	public Color getColor()
	{
		return this.main;
	}
	
	/**
	* this method swaps the main Color and the alternate Color of the current ChangingTwoColors object.
	*/
	public void toggleColor()
	{
		Color c = new Color( main.getRed(),main.getGreen(), main.getBlue());
		this.main = this.alternate;
		this.alternate = c;
	}
	/**
	*Overrides the ToString method, in order to print out the current object the folowing way : 
	* Main color :
	* Red = main.getRed()
	* Green = main.getGreen()
	* Blue = main.getBlue()
	* Alternate Color :
	* Red = alternate.getRed()
	* Green = alternate.getGreen()
	* Blue = alternate.getBlue()
	*/
	public String toString()
	{
		String result = "";
		
		result += "Main color : \n";
		result += this.main.toString();
		result += "Alternate color : \n";
		result += this.alternate.toString();
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Color c1 = new Color(128,0,0);
		Color c2 = new Color(0,128,0);
		
		ChangingTwoColors swapper = new ChangingTwoColors(c1, c2);
		System.out.println(swapper);
		System.out.println(swapper.getColor());
		swapper.toggleColor();
		System.out.println(swapper);
	}
}
