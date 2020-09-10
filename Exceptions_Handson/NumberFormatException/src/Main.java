import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String s;
		int deposit,cost;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The details of the item type ");
		System.out.println("Enter The Name");
		s = br.readLine();
		try {
			System.out.println("Enter The deposit");
			deposit = Integer.parseInt(br.readLine());
			System.out.println("Enter The cost");
			cost = Integer.parseInt(br.readLine());
			Itemtype i  = new Itemtype(s,deposit,cost);
			System.out.println("The details of the item type are");
			System.out.println(i.toString());

		}
		
		catch(NumberFormatException num)
		{
			num.getMessage();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
