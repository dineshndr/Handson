
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the cost of the item for n days");
		int cost = Integer.parseInt(br.readLine());
		System.out.println("Enter the value of n");
		int n = Integer.parseInt(br.readLine());
		Sample s = new Sample(n,cost);
		s.start();
		
		
	}

}
