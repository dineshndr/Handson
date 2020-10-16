package example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeContext.xml");
		Employee emp = context.getBean(Employee.class, "employee");
		Address address  = emp.getAddress();
		emp.display();
		address.display();
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
