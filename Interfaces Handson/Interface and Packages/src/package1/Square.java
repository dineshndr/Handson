package package1;

public class Square implements  Polygon {
		double side;
		
		public Square(double side) {
			super();
			this.side = side;
		}
		
		public double getSide() {
			return side;
		}

		public void setSide(double side) {
			this.side = side;
		}

		public double calcPeri()
		{
			return 4*side;
		}
		public double calcArea()
		{
			return side*side;
		}
}
