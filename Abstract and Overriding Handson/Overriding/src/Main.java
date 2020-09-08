import java.io.*;
public class Main {
		public static void main(String args[]) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//System.out.println("1.Exhibition\n2.StageEvent");
			
			
			System.out.println("Enter name of event");
			String s1= br.readLine();
			System.out.println("Enter detail of event");
			String s2= br.readLine();
			System.out.println("Enter owner name of event");
			String s3= br.readLine();
			Exhibition e = new Exhibition(s1,s2,s3);
			StageEvent s= new StageEvent(s1,s2,s3);
			System.out.println("1.Exhibition\n2.StageEvent");
			int ch = Integer.parseInt(br.readLine());
			if(ch==1)
			{
				
				System.out.println("1.Enter no of stalls");
				int c = Integer.parseInt(br.readLine());
				e.setNoOfstall(c);
				System.out.println(e.projectedRevenue());
				
			}
			else if(ch==2)
			{
				System.out.println("1.Enter no of shows");
				int d = Integer.parseInt(br.readLine());
				s.setNoOfShows(d);
				System.out.println("1.Enter no of seats per show");
				int f = Integer.parseInt(br.readLine());
				s.setNoOfSeatsPerShow(f);
				System.out.println(s.projectedRevenue());
			}
		}
}
