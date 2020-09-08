import java.io.*;

public class Main {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("List of shapes:\n1.Circle\n2.Rectangle\n3.Square");
			System.out.println("Enter your choice");
			int ch = Integer.parseInt(br.readLine());
			if(ch==1) 
			{
				Circle c = new Circle();
				System.out.println("Enter your radius");
				float a  = Float.parseFloat(br.readLine());
				c.setRadius(a);
				System.out.println("Area of circle:"+c.calculatePerimeter());
			}
			else if(ch==2)
			{
				Rectangle r = new Rectangle();
				System.out.println("Enter your length");
				float b  = Integer.parseInt(br.readLine());
				System.out.println("Enter your breadth");
				float c  = Float.parseFloat(br.readLine());
				r.setBreadth(c);
				r.setLength(b);
				System.out.println("Area of Rectangle:"+r.calculatePerimeter());
			}
			else if(ch==3)
			{
				Square s = new Square();
				System.out.println("Enter your side");
				float g  = Float.parseFloat(br.readLine());
				s.setSide(g);
				System.out.println("Area of square:"+s.calculatePerimeter());
			}
		}
}
