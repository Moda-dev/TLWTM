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


	private int seconds;
    /**
     * constructs a clock whose current time is h:m:s
     * @param h current hour between 0 and 23
     * @param m current minute between 0 and 59
     * @param s current second between 0 and 59
     */
    public Clock(int h, int m, int s) 
    {
    	this.seconds = h * 3600 + m * 60 + s;
    }

    /**
     * constructs a clock whose current time 
     * is given as the number of seconds since the beginning of the day.
     * @param sec number of seconds since the beginning of the day 
     *        between 0 and 86399
     */
    public Clock(int sec)
    {
    	this.seconds = sec;
    }


    /**
     * default constructor :
     * constructs a clock with hour, minute, second set to 0
     */
    public Clock() 
    {
    	this.seconds = 0;
    }


    /**
     * @return the number of seconds equivalent to the current time
     */
    public int convert2seconds()
    {
    	return this.seconds;
    }

    /**
     * @return the current hour between 0 and 23
     */
    public int getHours()
    {
    	return this.seconds/3600;
    }

    /**
     * @return the current minute between 0 and 60
     */
    public int getMinutes()
    {
    	return this.seconds%3600/60;
    }

    /**
     * @return the current second between 0 and 60
     */
    public int getSeconds()
    {
    	return this.seconds%3600%60;
    }

    /**
     * adds one second to the current time
     * N.B. : 23:59:59 + 1 second = 0:0:0
     */

    public void increments()
    {
    	this.seconds++;
    }

    /**
     * sets the current time to 00:00:00
     */
    public void reset()
    {
    	this.seconds = 0;
    }

    @Override
    /**
     *  @return a string representing the object 
     *  it looks like "h:m:s"
     */
    public String toString()
    {
    	int hours = this.getHours();
    	int minutes = this.getMinutes();
    	int seconds = this.getSeconds();
    	
    	return hours + ":" + minutes + ":" + seconds;
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
