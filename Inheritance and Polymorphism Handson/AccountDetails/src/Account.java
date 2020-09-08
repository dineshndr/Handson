public class Account {
		protected String accNo,accHoldername;
	    protected double balance;
	    public Account(String accNo, String accHoldername, double balance) {
			super();
			this.accNo = accNo;
			this.accHoldername = accHoldername;
			this.balance = balance;
		}
	    Account()
	    {
	    	
	    }
		public String getAccNo() {
			return accNo;
		}
		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}
		public String getAccHoldername() {
			return accHoldername;
		}
		public void setAccHoldername(String accHoldername) {
			this.accHoldername = accHoldername;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	    
}
