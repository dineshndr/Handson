
public class FixedAccount extends SavingsAccount{
		private int lockingPeriod;

		public FixedAccount(String accNo, String accHoldername, double balance) {
			super(accNo, accHoldername, balance);
			// TODO Auto-generated constructor stub
		}
		FixedAccount()
		{
			
		}
		public int getLockingPeriod() {
			return lockingPeriod;
		}

		public void setLockingPeriod(int lockingPeriod) {
			this.lockingPeriod = lockingPeriod;
		}
}
