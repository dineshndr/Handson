
class Product {
			private int product_code;
			
			private String product_name;
			
			private double price;
			
			private int stock;
			
			Product(int product_code,String product_name,double price,int stock)
			{
				this.product_code = product_code;
				this.product_name = product_name;
				this.stock = stock;
				this.price = price;
			}
			
			Product()
			{
				super();
			}

			public int getProduct_code() {
				return product_code;
			}

			public void setProduct_code(int product_code) {
				this.product_code = product_code;
			}

			public String getName() {
				return product_name;
			}

			public void setName(String product_name) {
				this.product_name = product_name;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public int getStock() {
				return stock;
			}

			public void setStock(int stock) {
				this.stock = stock;
			}
			
			void displayProduct()
			{
			System.out.println("Product code:"+product_code);
			
			System.out.println("Product name:"+product_name);
			
			System.out.println("Price:"+price);
			
			System.out.println("Stock:"+stock);
			}
			
			public static String checkPrice(Product e1,Product e2)
			{
				String s=new String();
				if(e1.getPrice()>e2.getPrice())	 s=e2.getName()+" is cheaper than "+e2.getName();
				else  s=e1.getName()+" is cheaper than "+e2.getName();
				return s;
			}
}
