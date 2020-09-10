import java.util.*;
class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ExtraType Details");

		String str=sc.nextLine();
		 
		String d[] = str.split("#");
		
		String name = d[0];
		
		long runs = Integer.parseInt(d[1]);
		
		ExtraType e = new ExtraType(name,runs);
		
		e.setName(name);
		
		e.setRuns(runs);
		
		e.getName();
		
		e.getRuns();
		
		e.displayExtra();
		
	}

}
