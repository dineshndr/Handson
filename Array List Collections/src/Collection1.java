import java.util.*;
import java.io.*;
	public class Collection1 {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			List<String> n = new ArrayList<String>(); 
			while(true)
			{
			System.out.println("Enter the username ");
			String t = br.readLine();
			n.add(t);
			System.out.println("Do u want to continue");
			String s = br.readLine();
			if(s.equals("y"))
			{
				
				continue;
			}
			else break;
		
			}
			for(String d:n)
			{
				System.out.println(d);
			}
	}

}
