
public class Sample {
			int n,cost;
			
			public Sample(int n, int cost) {
				super();
				this.n = n;
				this.cost = cost;
			}
			
			public int getN() {
				return n;
			}

			public void setN(int n) {
				this.n = n;
			}

			public int getCost() {
				return cost;
			}

			public void setCost(int cost) {
				this.cost = cost;
			}

			

			void start()
			{
				try
				{
					int k =cost/n;
					System.out.println("Cost per day of the item is "+k);
					
				}
				catch(ArithmeticException e)
				{
					System.out.println("java.lang.ArithmeticException: / by zero");
				}
			}
}

