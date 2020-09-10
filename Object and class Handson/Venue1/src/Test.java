import java.util.Scanner;
import java.io.*;
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
           
           e.setName(name);
           
           e.getName();
           
           e.setCity(city);
           
           e.getCity();
           
           e.displayVenue();
           
           e.showVenue();

           int choice = sc.nextInt();
         
           if(choice==1)
        	   {
        	   System.out.println("Enter the venue name");
        	   sc.nextLine();
        	   String name1=sc.nextLine();
        	   e.setName(name1);
        	   e.getName();
        	   e.displayVenue();
        	   e.showVenue();
        	   }
           else if(choice==2)
           {
        	   System.out.println("Enter the city name");
        	   sc.nextLine();
        	   String city1=sc.nextLine();
        	   
        	   e.setCity(city1);
        	   e.getCity();
        	   e.displayVenue();
        	   e.showVenue();
           }
           else if(choice==3)
           {
        	   e.displayVenue();
           }
         
	

	}

}
