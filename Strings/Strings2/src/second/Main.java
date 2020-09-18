package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException
	{
		String subString;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter email");
		subString= br.readLine();
		if(subString.contains(".com") || subString.contains(".in") || subString.contains(".net") || subString.contains(".org"))
		{
		System.out.println("Valid email address");
		}
		else 
			{
			System.out.println("Invalid email address");
			}
	}
}
