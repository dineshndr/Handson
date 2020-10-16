package example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) throws IOException
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(OwnerConfig.class);
		Owner owner = context.getBean(Owner.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name,password,mobile no:");
		String name1=br.readLine();
		String pwd1=br.readLine();
		String mobile1=br.readLine();
		owner.SetDetails(name1,pwd1,mobile1);
		owner.display();
		((AnnotationConfigApplicationContext)context).close();
	}
}
