
public class Triangle extends Shape {


			private double base,height;
			public Triangle(double area) {
				super(area);
				this.area = area;
			}
			Triangle()
			{
				
			}
			
			
			
			public double getBase() {
				return base;
			}


			public void setBase(double base) {
				this.base = base;
			}


			public double getHeight() {
				return height;
			}


			public void setHeight(double height) {
				this.height = height;
			}


			
			public void computeArea()
			{
				area = 0.5*base*height;
				System.out.println("Area of Triangle:"+area);
			}

			
			
}


