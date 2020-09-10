import java.util.*;
public class Test {

	public static void main(String[] args) {
		   String name;

           String city;

           

           Scanner sc=new Scanner(System.in);

           System.out.println("Enter the venue name");

           name=sc.nextLine();

           System.out.println("Enter the city name");

           city=sc.nextLine();          

           Venue e = new Venue(name,city);

           e.displayVenue();

	}

}
