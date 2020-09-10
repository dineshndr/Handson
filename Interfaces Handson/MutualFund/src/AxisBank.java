
public class AxisBank implements MutualFund {
	int amount,time;
	 public AxisBank(int amount, int time) {
		super();
		this.amount = amount;
		this.time = time;
	}
	 public void duration()
	 {
		 System.out.println("Axis Bank");
		 this.time=time;
	 }
	public void amount()
	{
		int r =((amount*time*56)/100);
		System.out.println("You will have returns as "+r+" In " +time+"years");
		this.amount = amount;
	}
	 
	
}
