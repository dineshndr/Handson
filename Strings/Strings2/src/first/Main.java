package first;
import java.io.*;
public class Main {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter no 1 address ");
		
			String str1  = br.readLine();
			String a[] = str1.split(","); 
			System.out.println("Enter no 2 address ");
			String str2  = br.readLine();
			String b[] = str2.split(","); 
			if((a[0].equals(b[0])) && (a[1].equals(b[1])) && (a[2].equals(b[2])) && (a[3].equals(b[3])))
			{
				System.out.println("RED");
			}
			
			else if((a[0].equalsIgnoreCase(b[0])) && (a[1].equalsIgnoreCase(b[1])) && (a[2].equalsIgnoreCase(b[2])) && (a[3].equalsIgnoreCase(b[3])))
			{
				System.out.println("BLUE");
			}
			else System.out.println("GREEN");
		}
		
}
