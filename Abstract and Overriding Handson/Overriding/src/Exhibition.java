
public class Exhibition extends Event {
				int noOfstall;

				public Exhibition(String name, String detail, String ownerName) {
					super(name, detail, ownerName);
					this.name = name;
					this.detail = detail;
					this.ownerName  = ownerName;
				
				}
				
				Exhibition()
				{
					
				}
			

				public int getNoOfstall() {
					return noOfstall;
				}

				public void setNoOfstall(int noOfstall) {
					this.noOfstall = noOfstall;
				}
				
				public double projectedRevenue()
				{
					return this.noOfstall*10000;
				}
}
