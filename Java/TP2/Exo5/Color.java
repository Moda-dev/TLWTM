/**
*
* Color class is used to represent a Color 
* caracterized by Red Green and Blue values. 
*
* @author DMonget
*
*/

public class Color
{
	public static final Color RED = new Color(255,0,0);
	public static final Color GREEN = new Color(0,255,0);
	public static final Color BLUE = new Color(0,0,255);
	public static final Color WHITE = new Color(255,255,255);
	public static final Color BLACK = new Color(0,0,0);
	
	//attribute values for red green and blue range from 0 to 255.
	//max byte value is 127.
	//max short value is 32,767. short is the 'lighest" type eligible to contain the color values.
	private short red;
	private short green;
	private short blue;
	
	/**
	* constructs a Color with its red green and blue values 
	* initialized at 0.
	*/
	public Color()
	{
		this.red = 0;
		this.green = 0;
		this.blue = 0;
		//System.out.println("Constructeur par défaut");
		
	}
	
	/**
	* constructs a Color with its red green and blue values 
	* initialized at the specified red green and blue values.
	* @param red a short number between 0 and 255.
	* @param green a short number between 0 and 255.
	* @param blue a short number between 0 and 255.
	*/
	public Color(short red, short green, short blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		//System.out.println("Constructeur par short");
		
	}
	
	/**
	* constructs a Color with its red green and blue values 
	* initialized at the specified red green and blue values.
	* @param red a int number between 0 and 255.
	* @param green a int number between 0 and 255.
	* @param blue a int number between 0 and 255.
	*/
	public Color(int red, int green, int blue)
	{
		this((short)red, (short)green, (short)blue);
		//System.out.println("Constructeur par int");
		
	}
	
	/**
	* constructs a Color with its red green and blue values 
	* initialized at the specified red green and blue percentages.
	* @param red a float number between 0 and 1.
	* @param green a float number between 0 and 1.
	* @param blue a float number between 0 and 1.
	*/
	public Color(float red, float green, float blue)
	{
		this.red = (short)Math.round(red*255);
		this.green = (short)Math.round(green*255);
		this.blue = (short)Math.round(blue*255);
		System.out.println("Constructeur par float");
		
	}
	/**
	* @return the short value of the red attribute.
	*/
	public short getRed()
	{ 
		return this.red;
	}
	
	/**
	* @return the short value of the green attribute.
	*/
	public short getGreen()
	{ 
		return this.green;
	}
	
	/**
	* @return the short value of the blue attribute.
	*/
	public short getBlue()
	{
		return this.blue;
	}
	
	/**
	* Sets the red attribute of the Color to red.
	* @param red a short number between 0 and 255.
	*/
	public void setRed( short red )
	{
		this.red = red;
	}
	
	/**
	* Sets the green attribute of the Color to green.
	* @param green a short number between 0 and 255.
	*/
	public void setGreen( short green )
	{ 
		this.green = green;
	}
	
	/**
	* Sets the blue attribute of the Color to blue.
	* @param blue a short number between 0 and 255.
	*/
	public void setBlue( short blue )
	{ 
		this.blue = blue;
	}
	
	/**
	* constructs a Color with its red green and blue values 
	* all initialized at the same specified number. This results 
	* in a color that is a level of gray.
	* @param red a short number between 0 and 255.
	*/
	public static Color createGrayLevel(short grayLevel)
	{
		return new Color(grayLevel, grayLevel, grayLevel);
	}
	
	/**
	* constructs a Color from its hue, saturation and value values. 
	* 
	* @param h a double number between 0 and 360.
	* @param s a double number between 0 and 255.
	* @param v a double number between 0 and 255.
	*/
	public static Color createFromHSV(double h, double s, double v)
	{
		int a = (int)Math.floor(h/60);
		System.out.println("a = "+a);
		float f = (float)((h/60)-a);
		System.out.println("f = "+f);
		
		float l = (float)(v*(1-s));
		System.out.println("l = "+l);
		float m = (float)(v*(1-f*s));
		System.out.println("m = "+m);
		float n = (float)(v*(1-(1-f)*s));
		System.out.println("n = "+n);
		
		Color c = null;
		
		switch (a)
		{
			case 0 :
				c = new Color((float)v, (float)n, (float)l);
				break;
			case 1 :
				c = new Color((float)m, (float)l, (float)v);
				break;
			case 2 :
				c = new Color((float)l, (float)v, (float)n);
				break;
			case 3 :
				c = new Color((float)l, (float)m, (float)v);
				break;
			case 4 :
				c = new Color((float)n, (float)l, (float)v);
				break;
			case 5 :
				c = new Color((float)v, (float)l, (float)m);
				break;
				
		}
		
		return c;
	}
	
	/**
	* Overrides the ToString method in order for the printed out object to look like the following : 
	* Red = this.red
	* Green = this.green
	* Blue = this.blue
	*/
	@Override
	public String toString()
	{
		String result = "Red = ";
		result += this.getRed();
		result += "; Green = ";
		result += this.getGreen();
		result += "; Blue = ";
		result += this.getBlue() + "\n";
		return result;
	}
	
	
	public static void main(String[] args)
	{
		Color c = new Color();
		Color k = new Color(10, 12, 15);
		
		Color v = Color.createFromHSV(0, 1, 1);
		System.out.println(v);
		Color w = Color.createFromHSV(60, 1, 1);
		System.out.println(w);
		Color x = Color.createFromHSV(60, 1, 0.5);
		System.out.println(x);
		Color y = Color.createFromHSV(120, 1, 0.5);
		System.out.println(y);
		Color z = Color.createFromHSV(240, 1, 0.5);
		System.out.println(z);
	}
}
