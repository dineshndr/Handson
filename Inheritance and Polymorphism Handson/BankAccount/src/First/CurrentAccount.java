
	package First;

	class CurrentAccount extends Account {
			private String tinNumber;
		
			CurrentAccount(String accName, String accNo, String bankName) {
				super(accName,accNo,bankName);
				this.accName = accName;
				this.accNo = accNo;
				this.bankName = bankName;
				this.tinNumber = tinNumber;
				
			}
			
			public String getTinNumber() {
				return tinNumber;
			}

			public void setTinNumber(String tinNumber) {
				this.tinNumber = tinNumber;
			}

			public void display() {
				super.display();
				System.out.println("TIN Number:"+tinNumber);
			}
			
				
	}




