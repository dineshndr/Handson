import java.io.*;



public class Main {
		public static void main(String args[]) throws IOException
		{
			Shape s = new Shape();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the shape:");
			System.out.println("1.circle\n2.Rectangle\n3.Triangle");
			int ch=0;
			ch = Integer.parseInt(br.readLine());
			if(ch==1)
			{
				Circle c= new Circle();
				System.out.println("Enter radius");
				double d = Double.parseDouble(br.readLine());
				c.setRadius(d);
				c.computeArea();
				
			}
			else if(ch==2)
			{
				Rectangle r =  new Rectangle();
				System.out.println("Enter length and Breadth");
				double l = Double.parseDouble(br.readLine());
				double b = Double.parseDouble(br.readLine());
				r.setLength(l);
				r.setBreadth(b);
			    r.computeArea();
			}
			else if(ch==3)
			{
				Triangle t =  new Triangle();
				System.out.println("Enter base and height");
				double ba = Double.parseDouble(br.readLine());
				double  h = Double.parseDouble(br.readLine());
				t.setBase(ba);
				t.setHeight(h);
			    t.computeArea();
			}
			else System.out.println("invalid"); 
		}
}
