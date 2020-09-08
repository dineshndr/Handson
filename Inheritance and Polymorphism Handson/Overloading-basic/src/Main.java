import java.util.*;



import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException
	{
		
		String name,detail,ownerName;
		String stallType;
		
		Integer squareFeet,numberOfTV;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stall s= new Stall();
		int x;
		System.out.println("Enter the name of the stall:");
		name = br.readLine();
		System.out.println("Enter the detail of the stall:");
		detail = br.readLine();
		System.out.println("Enter the owner name of the stall:");
		ownerName = br.readLine();
		System.out.println("Enter the type of the stall:");
		stallType = br.readLine(); 
		System.out.println("Enter the size of the stall in square feet:");
		squareFeet = Integer.parseInt(br.readLine());
		
		System.out.println("Does the hall have TV?");
		System.out.println("Enter yes or no");
		
		String h = br.readLine();
		String str1="yes";
		String str2="no";
		 if(h.equals(str1))
		 {
		 System.out.println("Enter the number of TV:");
		 numberOfTV = Integer.parseInt(br.readLine());
		 System.out.println(s.computeCost(stallType,squareFeet,numberOfTV));
		 
		 }
		 else if(h.contentEquals(str2))  System.out.println(s.computeCost(stallType,squareFeet));
		 else ;
		 
		 
	}
}
