import java.io.*;
public class Main {
		public static void main(String args[]) throws IOException
		{
			System.out.println("Choose Stall type");
			System.out.println("1)Gold Stall\r\n" + 
					"2)Premium Stall\r\n" + 
					"3)Executive Stall\r\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch = Integer.parseInt(br.readLine());
			
			if(ch==1)
			{
				System.out.println("Enter stall details in comma seperated values");
				String str1 = br.readLine();
				String a[] = str1.split(",");
				Stall s = new GoldStall(a[0],(Integer.parseInt(a[1])),a[2],(Integer.parseInt(a[3])));
				s.display();
			}
			else if(ch==2)
			{
				int cost,Projector;
				String stallName,ownerName;
				System.out.println("Enter stall details in comma seperated values");
				String str1 = br.readLine();
				String a[] = str1.split(",");
				Stall s = new PremiumStall(a[0],(Integer.parseInt(a[1])),a[2],(Integer.parseInt(a[3])));
				s.display();
			}
			else if(ch==3)
			{
				int cost,tvSet;
				String stallName,Screen;
				System.out.println("Enter stall details in comma seperated values");
				String str1 = br.readLine();
				String a[] = str1.split(",");
				Stall s = new ExecutiveStall(a[0],(Integer.parseInt(a[1])),a[2],(Integer.parseInt(a[3])));
				s.display();
			}
		}
}
