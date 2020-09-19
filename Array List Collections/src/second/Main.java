package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List n = new ArrayList<>();
		while(true)
		{
		System.out.println("Enter the details of itemtype ");
		System.out.println("Name: ");
		String t = br.readLine();
		System.out.println("Deposit: ");
		double d= Double.parseDouble(br.readLine());
		System.out.println("Cost per day:");
		double cost= Double.parseDouble(br.readLine());
		Itemtype i = new Itemtype(t,d,cost);
		 
		n.add(i);
		System.out.println("Do u want to continue");
		String s = br.readLine();
		if(s.equals("y"))
		{
			
			continue;
		}
		else break;
	
		}
		System.out.println("  Name:\t    Deposit:\t    CostPerday:");
		System.out.println(n.toString());
		
	}
}
