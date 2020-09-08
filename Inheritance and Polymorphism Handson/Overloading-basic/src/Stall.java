
public class Stall {
		protected String name,detail,ownerName;

		public Stall(String name, String detail, String ownerName) {
			super();
			this.name = name;
			this.detail = detail;
			this.ownerName = ownerName;
		}
		Stall()
		{
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public double computeCost(String stallType, Integer squareFeet)
		{
			String st1= "platinum";
			String st2 ="diamond";
			String st3 = "gold";
			double x=0;
			if(stallType.equals(st1)) x=200*squareFeet;
			else if(stallType.equals(st2)) x=150*squareFeet;
			else if(stallType.equals(st3))  x=100*squareFeet;
			return x;
		}
		public double computeCost(String stallType, Integer squareFeet, Integer numberOfTV)
		{
			double y=0;
			if(stallType.length()==8) y=((200*squareFeet)+(numberOfTV*10000));
			else if(stallType.length()==7) y=((150*squareFeet)+(numberOfTV*10000));
			else if(stallType.length()==4)  y=((100*squareFeet)+(numberOfTV*10000));
			return y;
		}
}
