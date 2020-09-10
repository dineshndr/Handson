package pune_Forts;

public class Rajmachi implements Fort {
	int distance = 55; 
	String s  = "Rajmachi";
	
	public Rajmachi(int distance, String s) {
		super();
		this.distance = distance;
		this.s = s;
	}

	public  void distance()
	{
		System.out.println("You are going to visit " + s + "."+"\nThe distance is " +distance+ "km");
	}
}
