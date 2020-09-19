package Third;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contains {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> al = new ArrayList<String>();
		System.out.println("Enter the no of halls");
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
	     	System.out.println("Enter hall name" +(i+1));
			String s = br.readLine();
			al.add(s);
		}
		System.out.println("enter hall name to be searhed");
		String c = br.readLine();
		int d  = al.indexOf(c);
		if(al.contains(c))
		{
			System.out.println(c+ "hall found at position " + d);
		}
}
}
