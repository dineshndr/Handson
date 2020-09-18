package fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		String subString;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of users");
		int n = Integer.parseInt(br.readLine());
		List l = new ArrayList();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the string");
		subString = br.readLine();
		String g[] = subString.split(",");
		Split k  = new Split(Integer.parseInt(g[0]),g[1],g[2],g[3]);
		l.add(k);
		}
		Split j = new Split();
		j.display(l);
		
	}

}
