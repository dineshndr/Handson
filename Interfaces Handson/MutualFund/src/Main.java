import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
			public static void main(String s[]) throws IOException
			{
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the amount you want to invest");
				int n = Integer.parseInt(br.readLine());
				System.out.println("Enter the tenure of the SIP");
				int t = Integer.parseInt(br.readLine());
				MutualFund m  = new AxisBank(n,t);
				MutualFund x  = new Hdfc(n,t); 
				MutualFund b  = new Icici(n,t);
				m.duration();
				m.amount();
				x.duration();
				x.amount();
				b.duration();
				
				b.amount();
				
			}
}
