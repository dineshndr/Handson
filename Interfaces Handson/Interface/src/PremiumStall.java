
public class PremiumStall implements Stall{
					String stallName,ownerName;;
					int cost,projector;
					public PremiumStall(String stallName,int cost, String ownerName,  int projector) {
						super();
						this.stallName = stallName;
						this.ownerName = ownerName;
						this.cost = cost;
						this.projector = projector;
					}
					PremiumStall()
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
					public int getProjector() {
						return projector;
					}
					public void setProjector(int projector) {
						this.projector = projector;
					}
					public void display()
					{
						System.out.println("Stall Name:"+this.stallName);
						System.out.println("Cost:"+this.cost);
						System.out.println("Owner Name:"+this.ownerName);
						System.out.println("Number of Projector:"+this.projector);
					}
}
