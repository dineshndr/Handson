package First;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args)throws IOException {
		
		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account\n2.Current Account");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		
		
		int ch=0;
		ch= Integer.parseInt(br.readLine());
		
		System.out.println("Enter details");
		String str=br.readLine();
		String a[]= str.split(",");
		

		if(ch==1)
		{
			SavingsAccount s = new SavingsAccount(a[0],a[1],a[2]);
			s.setOrgName(a[3]);
			s.display();
			
			
		}
		else if(ch==2)
		{
			CurrentAccount b = new CurrentAccount(a[0],a[1],a[2]);
			b.setTinNumber(a[3]);
			b.display();
			
		}
		

	}

}

