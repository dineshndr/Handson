import java.util.*;
class Test

{

              public static void main(String args[])

              {
            	  			
                            

			                  long over,ball,runs;
			
			                  String batsman;
			
			                  String bowler;
			
			                  String nonStriker;

                 
                             Scanner sc=new Scanner(System.in);

                             System.out.println("Enter the over");

                             over=sc.nextLong();

                             System.out.println("Enter the ball");

                             ball=sc.nextLong();

                             System.out.println("Enter the runs");

                             runs=sc.nextLong();

                             sc.nextLine();

                             System.out.println("Enter the batsman name");

                             batsman=sc.nextLine();

                             System.out.println("Enter the bowler name");

                             bowler=sc.nextLine();

                             System.out.println("Enter the nonStriker name");

                             nonStriker=sc.nextLine();         

                             Delivery e = new Delivery(over,ball,runs,batsman,bowler,nonStriker);

                             e.displayDeliveryDetails();

              }

}
