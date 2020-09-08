
public class Rectangle extends Shape {
			private double length,breadth;
			public Rectangle(double area) {
				super(area);
				this.area = area;
			}
			
			
			Rectangle()
			{
				
			}
			public double getLength() {
				return length;
			}

			public void setLength(double length) {
				this.length = length;
			}

			public double getBreadth() {
				return breadth;
			}

			public void setBreadth(double breadth) {
				this.breadth = breadth;
			}
				
			
			public void computeArea()
			{
				area = length*breadth;
				System.out.println("Area of Rectangle:"+area);
			}

			
			
}
