package fifth;
import java.util.*;
import java.io.*;
public class Calllog {
		String name,number,duration;

		public Calllog(String name, String number, String duration) {
			super();
			this.name = name;
			this.number = number;
			this.duration = duration;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String toString(Calllog u)
		{
			return u.getName()+"91"+u.getNumber()+"\t"+u.getDuration();
		}
		
		public static void display(List<Calllog> l)
		{
			l.sort((g,h) -> Integer.parseInt(g.getDuration()) - Integer.parseInt(h.getDuration()));
			System.out.println("CallLog:");
			System.out.println("Caller  caller name        Duration");
			for(Calllog t:l)
			{
				System.out.println(t.toString(t));
			}
		
		}
		
}
