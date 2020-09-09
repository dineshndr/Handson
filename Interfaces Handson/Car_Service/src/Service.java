
public class Service implements Car {
				int carNo;
				int ageCar;
				String Brand;
				public Service(int carNo, int ageCar, String brand) {
					super();
					this.carNo = carNo;
					this.ageCar = ageCar;
					Brand = brand;
				}
				public int getCarNo() {
					return carNo;
				}
				public void setCarNo(int carNo) {
					this.carNo = carNo;
				}
				public int getAgeCar() {
					return ageCar;
				}
				public void setAgeCar(int ageCar) {
					this.ageCar = ageCar;
				}
				public String getBrand() {
					return Brand;
				}
				public void setBrand(String brand) {
					Brand = brand;
				}
				public void sum()
				{
						int n=carNo, m, a, i = 1, counter = 0,add=0;
				       
				       
				        m = n;
				        while(n > 0)
				        {
				            n = n / 10;
				            counter++;
				        }
				        while(m > 0)
				        {
				            a = m % 10;
				            add  = add+a;
				            m = m / 10;
				            counter--;
				          
				        }
				     if(add%2!=0)  System.out.println("You can come on Tuesday, Thursday or Saturday");
				     else System.out.println("You can come on Monday, Wednesday and Friday. ");
				    }
				public void brand()
				{
					if(Brand=="Maruti")
					{
						String s = "Maruti";
					}
				}
				public void years()
				{
					int serviceCharge=5000;
					if(ageCar>5) System.out.println("Free service");
					else if(ageCar<5 && Brand.equals("Maruti") )					
						{
						System.out.println(((5000)*5/100));
						System.out.println("Not eligible Free service");
						}
					else
						{
						System.out.println("5000");
						System.out.println("Not eligible Free service");
						
						}
	
						
				}
				
				}

				