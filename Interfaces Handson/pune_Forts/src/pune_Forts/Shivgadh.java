package pune_Forts;

public class Shivgadh implements Fort {
	int distance = 100; 
	String s  = "Shivagadh";
	
	public Shivgadh(int distance, String s) {
		super();
		this.distance = distance;
		this.s = s;
	}

	public  void distance()
	{
		System.out.println("You are going to visit " + s + "."+"\nThe distance is " +distance+ "km");
	}
}
