package example3;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BoxContext.xml");
		
		Box b = context.getBean(Box.class,"b");
		User u = b.getUser();
		System.out.println("The hall of length "+b.getLength()+" and width "+b.getBreadth()+" is owned by "+u.getUname());
		((ClassPathXmlApplicationContext)context).close();

	}

}
