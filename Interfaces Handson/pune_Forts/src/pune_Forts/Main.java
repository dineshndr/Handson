package pune_Forts;
import java.io.*;

public class Main {
			public static void main(String s[]) throws IOException
			{
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the place you want to visit");
				System.out.println("Rajmachi\r\n" + 
						"Shivgadh\r\n" + 
						"Murud\r\n" + 
						"");
				int n = Integer.parseInt(br.readLine());
				if(n==1)
				{
					Fort f = new Rajmachi(55,"Rajmachi");
					f.distance();
				}
				else if(n==2)
				{
					Fort f = new Shivgadh(100,"Shivgadh");
					f.distance();
				}
				else if(n==3)
				{
					Fort f = new Murud(93,"Murud");
					f.distance();
				}
				}
				}
				