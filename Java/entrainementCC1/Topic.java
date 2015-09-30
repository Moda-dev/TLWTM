/**
 *The topic class is used to display a topic 
 *to be duscussed during class time.
 * @author DMonget 
 */

public class Topic {

	private String title;
	private String description;

	/**
	*The only constructor of the class. It uses 2 strings as parameters,
	*one to be assigned to the Topics title attribute, 
	*and one to be assigned to its description attribute.
	*
	*@param title a String containing the Topics title.
	*@param description a String containing the Topics description.
	*/
	public Topic(String title, String description){
		
		this.title = title;
		this.description = description;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getDescription()
	{
		return this.description;
	}

	/**
	*An Override of the toString method whose purpose is the display 
	*the Topic Object as follows : 
	*
	*Title : Fake Title
	*Description : 
	*Fake line 1
	*Fake line 2
	*/
	@Override
	public String toString(){
		
		String result = "";
		result += "Title : " + this.title + "\n";
		result += "Description : \n";
		result += this.description;
		return result;
		
	}
}
