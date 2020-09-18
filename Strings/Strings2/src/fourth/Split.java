package fourth;
import java.util.*;
public class Split extends ArrayList{
		int userID;
		String state,city,street;
		public Split(int userID, String state, String city, String street) {
			super();
			this.userID = userID;
			this.state = state;
			this.city = city;
			this.street = street;
		}
		Split()
		{
			
		}
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		void display(List<Split> u)
		{
			for(Split i:u)
			{
				System.out.println("UserID \t \tStreet \t \t\tCity \t\t \tState\t");
				System.out.printf("%-20s%-20s%-20s%-20s",i.getUserID(),i.getStreet(),i.getCity(),i.getState());
				System.out.println();
			}
		}
		
		
}
