import java.util.Scanner;

class Test {

	public static void main(String[] args) {
	    

         String str;
         
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter the Player Details");

         str=sc.nextLine();
         
         String details[] = str.split(",");
         
         String name=details[0];
        
         String country=details[1];
         
         String skill=details[2];
         
         Player e = new Player(name,country,skill);

         e.showPlayer();

	}

}
