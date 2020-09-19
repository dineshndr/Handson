package fourth;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException
	{
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		UserBO u = new UserBO();
		List l= new ArrayList();
		System.out.println("Enter the number of User details to be added");
		int n= Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the user" +(i+1) +"details");
			s= br.readLine();
			String k[] = s.split(",");
			User e = new User(k[0],k[1],k[2],k[3]);
			l.add(e);
		}
		UserBO r =new UserBO();
		u.addAll(l);
		System.out.println("Enter range to be removed");
		int a = Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		r.removeUser(a, b);
		r.display(r);
	}
}
