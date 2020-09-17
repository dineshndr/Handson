package strings;
import java.io.*;
class CheckStrings
	{
			String name1,name2;
			
			public CheckStrings(String name1, String name2) {
				super();
				this.name1 = name1;
				this.name2 = name2;
			}
			CheckStrings()
			{
				
			}
			
			public String getName1() {
				return name1;
			}

			public void setName1(String name1) {
				this.name1 = name1;
			}

			public String getName2() {
				return name2;
			}

			public void setName2(String name2) {
				this.name2 = name2;
			}

			public String concatString(String name1,String name2)
			{
				String s = name1.concat(name2);
				return "The concatenated name is "+s;
			}
			public String stringFound(String name1,String name2)
			{
				
				int n = name1.indexOf(name2);
				if(n==-1)
					return "Not Found";
				else return "Found";
			}
			public String Reverse(String str)
			{
				StringBuilder sb=new StringBuilder(str);  
			    sb.reverse();  
			    return "Dumpty says "+sb.toString();  
			}
			public String ReplaceString(String name1,String name2,String name3)
			{
				return "Replaced String :"+name1.replace(name2, name3);
			}
			public String RemoveString(String n1,String n2)
			{
			
				
				return "Dumpty's New Sentense :"+n1.replace(n2,"");
			}
			public String  InsertString(String name1,String name2,int g)
			{
				StringBuffer f = new StringBuffer(name1);
				
				return "Dumpty's New Sentense :"+f.insert(g,name2);
			}
			public void CountWords(String name1,String name2)
			{
				int c,d=0;
				
				String n1[]=name1.split("");
				c =n1.length;
				String n2[]=name2.split("");
				d =n2.length;
				if(c==d)  System.out.println( "Both have used equal number of words");
				else if(c>d) System.out.println("Humpty has used more words");
				else if(c<d) System.out.println("Dumpty has used more words");
			}
			public String toUpperCase(String nam1)
			{
				return "converted String:"+nam1.toUpperCase();
			}
			public void checkUpperCase(String j)
			{
				int b = j.length();
				char[] a =new char[b];
				for(int l =0;l<b;l++)
				{
					if((int)a[l]>65)
					{
						break;
					}
					else System.out.println("String is in uppercase");
					
				}
				System.out.println("String is not in uppercase");
			}
	}