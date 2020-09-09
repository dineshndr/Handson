
public class ExecutiveStall implements Stall {
						String stallName,ownerName;;
						int cost,screen;
						public ExecutiveStall(String stallName, int cost, String ownerName,  int screen) {
							super();
							this.stallName = stallName;
							this.ownerName = ownerName;
							this.cost = cost;
							this.screen = screen;
						}
						ExecutiveStall()
						{
							
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
						public int getCost() {
							return cost;
						}
						public void setCost(int cost) {
							this.cost = cost;
						}
						public int getScreen() {
							return screen;
						}
						public void setScreen(int screen) {
							this.screen = screen;
						}
						public void display()
						{
							System.out.println("Stall Name:"+this.stallName);
							System.out.println("Cost:"+this.cost);
							System.out.println("Owner Name:"+this.ownerName);
							System.out.println("Number of screens:"+this.screen);

						}
}
