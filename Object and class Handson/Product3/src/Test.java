
import java.util.*;
public class Test {
	public static Product[] buildProduct(int n)
	{
	
			int product_code;
			
		    String product_name;
			
		    double price;
			
			int stock;
			
			Product[] e1;
			
			e1 = new Product[n];
			
			for(int k=0;k<n;k++)
			{
			
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
			 
			e1[k]=new Product(product_code,product_name,price,stock);
			
			}
			return e1;
		}
public static void main(String args[])
{
	int m=0;
	Product p1;
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Enter no of products");
	m=sc.nextInt();
	
	Product[] e = Test.buildProduct(m);

	
	for(int i=0;i<m;i++)
	{
	
		e[i].displayProduct();
		System.out.println("Discount Price:"+Product.getdiscountPrice(e[i].getPrice()));
		//System.out.println(Product.checkPrice(e,q));
	}	
	System.out.println("Product with min stock");
	p1= Product.checkLessStock(e);
	System.out.println("Name:"+p1.getName());
	System.out.println("Stock"+p1.getStock());
}
}