package third;
import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
	
public static void main(String args[]) throws IOException
		{
			String substring;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter date");
			substring=br.readLine();
			if(substring.charAt(2)=='/')
			{
			String t= substring.replace('/', '-');
			System.out.println("Correct date format");
			System.out.println(t);
			}
			else if(substring.charAt(2)=='*')
			{
			String h= substring.replace('*', '-');
			System.out.println("Correct date format");
			System.out.println(h);
			}
				
			}
		}

