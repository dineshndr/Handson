class GoldStall implements Stall {
			int cost,tvSet;
			String stallName,ownerName;
			public GoldStall( String stallName,int cost, String ownerName,int tvSet) {
				super();
				this.cost = cost;
				this.tvSet = tvSet;
				this.stallName = stallName;
				this.ownerName = ownerName;
			}
			GoldStall()
			{
				
			}
			
			public int getCost() {
				return cost;
			}
			public void setCost(int cost) {
				this.cost = cost;
			}
			public int getTvSet() {
				return tvSet;
			}
			public void setTvSet(int tvSet) {
				this.tvSet = tvSet;
			}
			public String getStallName() {
				return stallName;
			}
			public void setStallName(String stallName) {
				this.stallName = stallName;
			}
			public String getOwnerName() {
				return ownerName;
			}
			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}
			public void display()
			{
				System.out.println("Stall Name:"+this.stallName);
				System.out.println("Cost:"+this.cost);
				System.out.println("Owner Name:"+this.ownerName);
				System.out.println("Number of TV sets:"+this.tvSet);
			}
			}
