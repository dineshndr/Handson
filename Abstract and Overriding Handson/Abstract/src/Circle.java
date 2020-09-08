
public class Circle extends Shape {
				Float radius;
				
				public Float getRadius() {
					return radius;
				}
				public void setRadius(Float radius) {
					this.radius = radius;
				}
				public Double calculatePerimeter()
				{
					return (double)(3.14*radius*radius);
				}
}
