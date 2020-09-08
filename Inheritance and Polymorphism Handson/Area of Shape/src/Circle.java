
public class Circle extends Shape {
			private double radius;
			public Circle(double area) {
				super(area);
			}	
			Circle()
			{
				
			}
			
			
			public double getRadius() {
				return radius;
			}

			public void setRadius(double radius) {
				this.radius = radius;
			}

			
			public void computeArea()
			{
				area = (3.14*radius*radius);
				System.out.println("Area of Circle:"+area);
			}
			
			
}
