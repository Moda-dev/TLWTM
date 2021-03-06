package clock.model;

/**
 *
 * Clock class is used to encode the current time.
 * It provides access to its 24-hour interpretation,
 * i.e. the day begins at midnight : 00:00:00 and ends at 23:59:59
 *
 * @author yourname
 *
 */
public class Clock {


	private int hours;
	private int minutes;
	private int seconds;
	
	
    /**
     * constructs a clock whose current time is h:m:s
     * @param h current hour between 0 and 23
     * @param m current minute between 0 and 59
     * @param s current second between 0 and 59
     */
    public Clock(int h, int m, int s) 
    {
    	this.hours = h;
    	this.minutes = m;
    	this.seconds = s;
    }

    /**
     * constructs a clock whose current time 
     * is given as the number of seconds since the beginning of the day.
     * @param sec number of seconds since the beginning of the day 
     *        between 0 and 86399
     */
    public Clock(int sec)
    {
    	this.hours = sec/3600;
    	this.minutes = (sec%3600)/60;
    	this.seconds = sec%3600%60;
    }


    /**
     * default constructor :
     * constructs a clock with hour, minute, second set to 0
     */
    public Clock() 
    {
    	this.hours = 0;
    	this.minutes = 0;
    	this.seconds = 0;
    }


    /**
     * @return the number of seconds equivalent to the current time
     */
    public int convert2seconds()
    {
    	int result = 0;
    	result = this.hours*3600;
    	result += this.minutes*60;
    	result += this.seconds;
    	return result;
    }

    /**
     * @return the current hour between 0 and 23
     */
    public int getHours()
    {
    	return this.hours;
    }

    /**
     * @return the current minute between 0 and 60
     */
    public int getMinutes()
    {
    	return this.minutes;
    }

    /**
     * @return the current second between 0 and 60
     */
    public int getSeconds()
    {
    	return this.seconds;
    }

    /**
     * adds one second to the current time
     * N.B. : 23:59:59 + 1 second = 0:0:0
     */

    public void increments()
    {
	this.seconds++;
	
	//Si les secondes atteignent 60, on ajoute une minute.
	if( this.seconds > 59)
	{
		this.minutes++;
		this.seconds = 0;
		
		//Si les minutes atteignent 60, on ajoute une heure.
		if( this.minutes > 59)
		{
			this.hours++;
			this.minutes = 0;
			
			//si les heures atteignent 24, on commence une nouvelle journée ( 00:00:00 ).
			if ( this.hours > 23 )
			{
			    	this.hours = 0;
			    	this.minutes = 0;
			    	this.seconds = 0;
			}
		} 	
	}
    }

    /**
     * sets the current time to 00:00:00
     */
    public void reset()
    {
    	this.hours = 0;
    	this.minutes = 0;
    	this.seconds = 0;
    }

    @Override
    /**
     *  @return a string representing the object 
     *  it looks like "h:m:s"
     */
    public String toString()
    {
    	String result;
    	result = ""+this.hours+":"+this.minutes+":"+this.seconds+"";
    	return result; 
    }
    
    public static void main(String[] args)
    {
    	//on initialise un objet clock
    	Clock hms = new Clock(15, 55, 59);
    	
    	//test des Getters
    	System.out.println("Test des Getters :");
    	System.out.println(hms.getHours());
    	System.out.println(hms.getMinutes());
    	System.out.println(hms.getSeconds());
    	
    	//test de la conversion en secondes
    	System.out.println("Test de la conversion en secondes :");
    	int seconds = 0;
    	seconds = hms.convert2seconds();
    	System.out.println(seconds);
    	
    	//test de l'incrémentation.
    	System.out.println("Test de l'incrémentation :");
    	String toStrong;
    	hms.increments();
    	toStrong = hms.toString();
    	System.out.println(toStrong);
    	
    	//test du reset.
    	System.out.println("Test du reset :");
    	hms.reset();
    	toStrong = hms.toString();
    	System.out.println(toStrong);
    	
    }

}
