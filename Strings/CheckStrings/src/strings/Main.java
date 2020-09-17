package strings;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("1.Concatenation\n"+"2.Search\n"+"3.Reverse String\n"+"4.Replace String\n"+"6.Remove String\n"+"7.InsertString\n"+"8.Count words\n"+"9.toUpper\n"+"10.checkUpper\n");
		System.out.println("enter choice");
		int c;
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		s.nextLine();
		switch(c)
		{
			case 1:
				CheckStrings k = new CheckStrings();
				String n,m;
				System.out.println("Enter Humpty's Sentence");
				n= s.nextLine();
				System.out.println("Enter Dumpty's Sentence");
				m=s.nextLine();
				System.out.println(k.concatString(n,m));
				break;
			case 2:
				String a,b;
				System.out.println("Enter Humpty's Sentence");
				a= s.nextLine();
				System.out.println("Enter Dumpty's Sentence");
				b=s.nextLine();
				CheckStrings g = new CheckStrings(a,b);
				System.out.println(g.stringFound(a,b));
				break;
			case 3:
				String e,f;
				System.out.println("Enter Humpty's Sentence");
				e= s.nextLine();
				CheckStrings h = new CheckStrings();
				System.out.println(h.Reverse(e));
				break;
			case 4:
				String i,j,l;
				System.out.println("Enter Humpty's Sentence");
				i= s.nextLine();
				System.out.println("Word to replace");
				j=s.nextLine();
				System.out.println("Synonym");
				l=s.nextLine();
				CheckStrings o = new CheckStrings();
				System.out.println(o.ReplaceString(i,j,l));
				break;
			case 6:
				String p,q;
				System.out.println("Enter Humpty's Sentence");
				p= s.nextLine();
				System.out.println("Enter word to be removed");
				q=s.nextLine();
				CheckStrings r = new CheckStrings();
				System.out.println(r.RemoveString(p,q));
				break;
			case 7:
				String t,u;
				int v;
				System.out.println("Enter Humpty's Sentence");
				t= s.nextLine();
				System.out.println("Word to insert");
				u=s.nextLine();
				System.out.println("Position");
				v=s.nextInt();
				CheckStrings w = new CheckStrings();
				System.out.println(w.InsertString(t,u,v));
				break;
			case 8:
				String a1,b1;
				System.out.println("Enter Humpty's Sentence");
				a1= s.nextLine();
				System.out.println("Enter Dumpty's Sentence");
				b1=s.nextLine();
				CheckStrings x = new CheckStrings();
				x.CountWords(a1,b1);
				break;
			case 9:
				String a2,b2;
				System.out.println("Enter Humpty's Sentence");
				a2= s.nextLine();
				CheckStrings y = new CheckStrings();
				System.out.println(y.toUpperCase(a2));
				break;
			case 10:
				String a3,b3;
				System.out.println("Enter Humpty's Sentence");
				a3= s.nextLine();
				CheckStrings z= new CheckStrings();
				z.checkUpperCase(a3);
				break;
			default:
				System.out.println("invalid");
		}

	}

}
