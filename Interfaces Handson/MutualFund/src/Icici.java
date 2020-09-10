
public class Icici implements MutualFund {
	int amount,time;
	 public Icici(int amount, int time) {
		super();
		this.amount = amount;
		this.time = time;
	}
	 public void duration()
	 {
		 System.out.println("Icici Bank");
		 this.time=time;
	 }
	public void amount()
	{
		int r =((amount*time*60)/100);
		System.out.println("You will have returns as "+r+" In " +time+"years");
		this.amount = amount;
	}
	 
	
}
