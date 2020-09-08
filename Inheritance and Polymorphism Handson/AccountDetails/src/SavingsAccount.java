
public class SavingsAccount extends Account {
				protected double minbal;

				public SavingsAccount(String accNo, String accHoldername, double balance) {
					super(accNo,accHoldername,balance);
					// TODO Auto-generated constructor stub
				}
				SavingsAccount()
				{
					
				}
				public double getMinbal() {
					return minbal;
				}

				public void setMinbal(double minbal) {
					this.minbal = minbal;
				}

				
}
