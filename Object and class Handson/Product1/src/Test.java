import java.util.*;
public class Test {
	public static Product buildProduct()
	{
	
			int product_code;
			
		    String product_name;
			
		    double price;
			
			int stock;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter product code:");
			
			product_code = sc.nextInt();
			
			System.out.println("enter name:");
			
			sc.nextLine();
			
			product_name = sc.nextLine();
			
			System.out.println("Enter price:");
			
			price = sc.nextDouble();
			
			sc.hasNextLine();
			
			System.out.println("Enter stock");
			
			stock  = sc.nextInt();

			Product e1=new Product(product_code,product_name,price,stock);
			
			return e1;
		}
public static void main(String args[])
{
	Product e=Test.buildProduct();
	Product q=Test.buildProduct();
	e.displayProduct();
	System.out.println("Discount Price:"+Product.getdiscountPrice(e.getPrice()));
	q.displayProduct();
	System.out.println("Discount Price:"+Product.getdiscountPrice(q.getPrice()));
	System.out.println(Product.checkPrice(e,q));
}
}