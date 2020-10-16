package example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = context.getBean(User.class);
		user.display();
		((AnnotationConfigApplicationContext)context).close();
	}
}
