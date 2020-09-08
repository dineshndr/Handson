
public class Square extends Shape {
			float side;
			public Double calculatePerimeter()
			{
				return (double)(side*side);
			}
			public float getSide() {
				return side;
			}
			public void setSide(float side) {
				this.side = side;
			}
}
