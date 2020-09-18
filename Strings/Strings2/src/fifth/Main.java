package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String args[]) throws IOException
		{
			String str;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter event name");
			str= br.readLine();
			Character d = str.charAt(0);
			boolean b= Character.isUpperCase(d);
			if(b)
			{
				System.out.println(str);
			}
			else
				{
				char s = Character.toUpperCase(d);
				int l = str.length();
				System.out.println(s + str.substring(1,l));
					}
				}
			
		}

