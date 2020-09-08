package First;

public class SavingsAccount extends Account {
		private String orgName;
		

		public SavingsAccount(String accName, String accNo, String bankName) {
			super(accName, accNo, bankName);
			
		}

		public String getOrgName() {
			return orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		
		public void display()
		{
			super.display();
			System.out.println("Organisation Name:"+orgName);
		}
}

