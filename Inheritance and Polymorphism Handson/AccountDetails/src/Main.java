import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Account details");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		AccountBO f =new AccountBO();
		f.getAccountDetail(s);
	}

}
