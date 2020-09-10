import java.util.*;
public class Test {

	public static void main(String[] args) {
		int product_code,product_code2;
		
	    String product_name,product_name2;
		
	    double price,price2;
		
		int stock,stock2;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("enter product code");
		
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
		
		System.out.println("enter product code");
		
		product_code2 = sc.nextInt();
		
		System.out.println("enter name:");
		
		sc.nextLine();
		
		product_name2 = sc.nextLine();
		
		
		
		System.out.println("Enter price:");
		
		price2 = sc.nextDouble();
		
		sc.hasNextLine();
		
		System.out.println("Enter stock");
		
		stock2 = sc.nextInt();
	
		e1.setProduct_code(product_code);
		
		e1.getProduct_code();
		
		e1.setName(product_name);
		
		e1.getName();
		
		e1.setPrice(price);
		
		e1.getPrice();
		
		e1.setStock(stock);
		
		e1.getStock();
			
		Product e2 = new Product(product_code2,product_name2,price2,stock2);
		
		e2.setProduct_code(product_code2);
		
		e2.getProduct_code();
		
		e2.setName(product_name2);
		
		e2.getName();
		
		e2.setPrice(price2);
		
		e2.getPrice();
		
		e2.setStock(stock2);
		
		e2.getStock();
		
		System.out.println("Product detials:");
		
		e1.displayProduct();
		
		e2.displayProduct();
		
		System.out.println(Product.checkPrice(e1,e2));
		
		
		}

}
