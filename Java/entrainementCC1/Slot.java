/**
*The Slot class is used to manipulate schedule slots. 
*They contain all the information about the lesson duration and type,
*aswell as the teacher lecturing, and the topic discussed.
*
* @author DMonget
*/
public class Slot  {

	private static final int COURS = 0;
	private static final int TD = 1;
	private static final int TP = 2;

	private Topic topic;
	private Teacher teacher;
	private String slotType;
	private int duration;
	
	/**
	*This constructor initializes a Slot object from the 4 given parameters
	*
	*@param topic a valid Topic object
	*@param teacher a valid Teacher object
	*@param slotType an int ( sent as one of the class's static constants )
	*@param duration an int giving the duration in minutes. 
	*/
	public Slot(Topic topic, Teacher teacher, int slotType, int duration)
	{
		this.topic = topic;
		this.teacher = teacher;
		switch (slotType)
		{
			case COURS : 
				this.slotType = "Cours";
				break;
			case TD : 
				this.slotType = "TD";
				break;
			case TP : 
				this.slotType = "TP";
				break;
		}
		this.duration = duration;
	}
	/**
	*The constructor initializes a Slot object from the 3 given parameters
	*The duration takes on the default value of 120.
	*@param topic a valid Topic object
	*@param teacher a valid Teacher object
	*@param slotType an int ( sent as one of the class's static constants )
	*/
	public Slot(Topic topic, Teacher teacher, int slotType)
	{
		this.topic = topic;
		this.teacher = teacher;
		switch (slotType)
		{
			case COURS : 
				this.slotType = "Cours";
				break;
			case TD : 
				this.slotType = "TD";
				break;
			case TP : 
				this.slotType = "TP";
				break;
		}
		this.duration = 120;
	}
	
	public static Slot createCoursSlot(Topic topic, Teacher teacher, int duration)
	{
		return new Slot(topic, teacher, 0, duration);
	}
	
	public static Slot createTDSlot(Topic topic, Teacher teacher, int duration)
	{
		return new Slot(topic, teacher, 1, duration);
	}
	
	public static Slot createTPSlot(Topic topic, Teacher teacher, int duration)
	{
		return new Slot(topic, teacher, 2, duration);
	}

	@Override
	public String toString(){
		
		String result = "";
		result += "Topic : " + this.topic.getTitle() + "\n";
		result += "Teacher : " + this.teacher.getFirstName() + " " + this.teacher.getLastName() + "\n";
		result += "Type : " + this.slotType + "\n";
		result += "Duration : " + this.duration + " minutes";
		return result;
	}



	public static void main(String[] args){
	
		String[] jrr_name = {"John", "Ronald","Reuel"};
		Teacher  jrr = new Teacher(jrr_name, "Tolkien");

		Topic lotr = new Topic("Lord of the rings", 
		"One Ring to rule them all,\n"
		+ "One Ring to find them, "
		+ "\nOne Ring to bring them all \nand "
		+ "in the darkness bind them");

		Slot s = new Slot(lotr,jrr,Slot.TD);


		System.out.println(jrr);
		System.out.println("*************************");
		System.out.println(lotr);
		System.out.println("*************************");
		System.out.println(s);
		System.out.println("*************************");
		
		Slot d = Slot.createTDSlot(lotr,jrr,60);
		System.out.println(s);
}


}
