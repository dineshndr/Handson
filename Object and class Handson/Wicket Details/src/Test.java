import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of wickets");
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		sc.nextLine();

		for(int i=1;i<=c;i++)
		{
			System.out.println("Enter the details of wicket"+i);
			
			String s= sc.nextLine();
			
			String d[] = s.split(",");
			
			
			
			long over =Integer.parseInt(d[0]);
			
			
			long ball =Integer.parseInt(d[1]);
			
			String wicketType =(d[2]);
			
			String playerName =(d[3]);
			
			String  bowlerName=(d[4]);
			
			Wicket e = new Wicket(over,ball,wicketType,playerName,bowlerName);
			
			e.setOver(over);
			
			e.getOver();
			
			e.setBall(ball);
			
			e.getBall();
			
			e.setWicketType(wicketType);
			
			e.getWicketType();
			
			e.setPlayerName(playerName);
			
			e.getPlayerName();
			
			e.setBowlerName(bowlerName);
			
			e.getBowlerName();
			
			e.Display();
			
		}
	}

}
