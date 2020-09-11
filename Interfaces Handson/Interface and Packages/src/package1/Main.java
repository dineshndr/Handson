package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length and breadth for rectangle");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter side for square");
		int c = Integer.parseInt(br.readLine());
		Polygon p  = new Rectangle(a,b);
		Polygon f  = new Square(c);
		System.out.println("The perimeterof rectangle:"+p.calcPeri());
		System.out.println("The perimeterof square:"+f.calcPeri());
		System.out.println("The area of rectangle:"+p.calcArea());
		System.out.println("The area of square:"+f.calcArea());
	}

}
