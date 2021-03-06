import java.util.*;
/**
*
* ChangingManyColors is a class encapsuling two or more Color objects,
* At any given moment, it is capable of switching them around.
*
* @author DMonget
*
*/

public class ChangingManyColors
{
	private ArrayList<Color> colors;
	
	
	/**
	* Contructs a ChangingManyColors object, from an array of Colors.
	*
	*@param colorArray a valid Color array.
	*/
	public ChangingManyColors(Color[] colorArray)
	{
		this.colors = new ArrayList<Color>(Arrays.asList(colorArray));
	}
	/**
	* Sets the colors of the current ChangingManyColors Object to the colors passed as parameters.
	*
	*@param one a valid Color object.
	*@param two a valid Color object. 
	*/
	public void setColors( Color[] colorArray)
	{
		this.colors = new ArrayList<Color>(Arrays.asList(colorArray));
	}
	
	/**
	*@return The main Color of the current ChangingManyColors object (index 0 of the ArrayList).
	*/
	public Color getColor()
	{
		return this.colors.get(0);
	}
	
	/**
	* this method removes the first item of the list, and reinserts it and the and of the list.
	*/
	public void toggleColor()
	{
		this.colors.add(this.colors.remove(0));
	}
	/**
	*Overrides the ToString method, in order to print out the current object the folowing way : 
	* Color *colorIndex* :
	* Red = alternate.getRed()
	* Green = alternate.getGreen()
	* Blue = alternate.getBlue()
	* etc...
	*/
	public String toString()
	{
		String result = "";
		
		for(int i = 0; i < this.colors.size(); i++)
		{
			result += "Color " + i + " :\n";
			result += this.colors.get(i).toString();
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Color c1 = new Color(128,0,0);
		Color c2 = new Color(0,128,0);
		Color c3 = new Color(0,0,128);
		Color c4 = new Color(128,0,128);
		
		Color[] colors = new Color[3];
		
		colors[0] = c1;
		colors[1] = c2;
		colors[2] = c3;
		
		ChangingManyColors swapper = new ChangingManyColors(colors);
		System.out.println(swapper);
		
		System.out.println(swapper.getColor());
		
		swapper.toggleColor();
		System.out.println(swapper);
		
		swapper.toggleColor();
		System.out.println(swapper);
	}
}
