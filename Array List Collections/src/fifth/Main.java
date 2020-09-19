package fifth;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		String s,l;
		File f= new File("abc.txt");	
		BufferedReader br = new BufferedReader(new FileReader(f));
		l= "";
		s=null;
		List a = new ArrayList();
		while((l=br.readLine())!=null)
		{
			String[] arr= l.split(",");
			Calllog v =new  Calllog(arr[0],arr[1],arr[3]);
			a.add(v);
		}
		Calllog.display(a);
	}

}
