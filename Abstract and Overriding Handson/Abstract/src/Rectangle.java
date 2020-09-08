
public class Rectangle extends Shape {
			float length,breadth;
			
			public float getLength() {
				return length;
			}

			public void setLength(float length) {
				this.length = length;
			}

			public float getBreadth() {
				return breadth;
			}

			public void setBreadth(float breadth) {
				this.breadth = breadth;
			}

			public Double calculatePerimeter()
			{
				return (double)(length*breadth);
			}

}
