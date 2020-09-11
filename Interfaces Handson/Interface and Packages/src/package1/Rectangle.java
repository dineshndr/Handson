package package1;

public class Rectangle implements Polygon {
			double length,breadth;
			
			public Rectangle(double length, double breadth) {
				super();
				this.length = length;
				this.breadth = breadth;
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

			public double calcPeri()
			{
				return 2*(length+breadth);
			}
			public double calcArea()
			{
				return length*breadth;
			}
	}


