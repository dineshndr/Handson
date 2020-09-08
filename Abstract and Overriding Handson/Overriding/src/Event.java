
public class Event {
		protected String name,detail,ownerName;

		public Event(String name, String detail, String ownerName) {
			super();
			this.name = name;
			this.detail = detail;
			this.ownerName = ownerName;
		}
		Event()
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
		public double projectedRevenue()
		{
			return 0.0;
		}
}
