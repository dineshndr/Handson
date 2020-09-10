import java.util.*;
class Test {

	public static void main(String[] args) {
	     String name;

         String country;

         String skill;

         
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter the Player name");

         name=sc.nextLine();

         System.out.println("Enter the Country name");

         country=sc.nextLine();

         System.out.println("Enter the skill");

         skill=sc.nextLine();         

         Player e = new Player(name,country,skill);

         e.showPlayer();

	}

}
