/**
*
* @author votre_nom
*/
public class Teacher {

	private static int nbTeacher = 1;
	private int rang;
	
	private String[] firstNames;
	private String lastName;
	
	/**
	*
	*
	*/
	public Teacher(String[] firstName, String lastName)
	{
		this.firstNames = firstName;
		this.lastName = lastName;

		this.rang = Teacher.nbTeacher;
		Teacher.nbTeacher ++;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getFirstName()
	{
		return this.firstNames[0];
	}
	

	/**
	*
	*
	*
	*/
	@Override
	public String toString()
	{
		String result = "";
		
		for(int i = 0; i < this.firstNames.length; i++)
		{
			result += this.firstNames[i] + " ";
		}
		
		result += " " + this.lastName;
		result += " (" + this.rang + ")";
		return result;
	}
}
