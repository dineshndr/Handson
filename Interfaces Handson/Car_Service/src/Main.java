import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException
	{
		int carNo;
		int ageCar;
		String Brand;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your car number");
		carNo = Integer.parseInt(br.readLine());
		System.out.println("Enter your car age");
		ageCar = Integer.parseInt(br.readLine());
		System.out.println("Enter your car brand");
		Brand = br.readLine();
		Car c = new Service(carNo,ageCar,	Brand);
		c.sum();
		c.years();
		c.brand();
		
}

}