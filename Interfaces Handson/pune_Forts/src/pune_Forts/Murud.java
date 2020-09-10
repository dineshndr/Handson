package pune_Forts;

public class Murud implements Fort {
	int distance = 93; 
	String s  = "Murud";
	
	public Murud(int distance, String s) {
		super();
		this.distance = distance;
		this.s = s;
	}

	public void distance()
	{
		System.out.println("You are going to visit " + s + "."+"\nThe distance is " +distance+ "km");
	}
}
