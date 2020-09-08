
public class StageEvent extends Event {
			int noOfShows,noOfSeatsPerShow;

			public StageEvent(String name, String detail, String ownerName) {
				super(name, detail, ownerName);
				
			}
			StageEvent()
			{
				
			}
			public int getNoOfShows() {
				return noOfShows;
			}

			public void setNoOfShows(int noOfShows) {
				this.noOfShows = noOfShows;
			}

			public int getNoOfSeatsPerShow() {
				return noOfSeatsPerShow;
			}

			public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
				this.noOfSeatsPerShow = noOfSeatsPerShow;
			}
			public double projectedRevenue()
			{
				return noOfSeatsPerShow*noOfShows*50;
			}
			
}
