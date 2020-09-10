
public class Hdfc implements MutualFund {
				int amount,time;
				 public Hdfc(int amount, int time) {
					super();
					this.amount = amount;
					this.time = time;
				}
				public void duration()
				 {
					 System.out.println("Hdfc Bank");
					 this.time=time;
				 }
				public void amount()
				{
					int r =((amount*time*49)/100);
					System.out.println("You will have returns as "+r+" In " +time+"years");
					this.amount = amount;
				}
				 
				
}
