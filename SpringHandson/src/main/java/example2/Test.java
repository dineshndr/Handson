package example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeContext1.xml");
		Employee e=context.getBean(Employee.class,"employee");
		System.out.println("name:"+e.getEmpName()+"\n"+"mobile:"+e.getEmpMob()+"\n"+"mail:"+e.getEmpMail()+"\n"+"salary:"+e.getEmpSal());
		Address address=e.getEmpAddress();
		System.out.println("Address:"+"\n"+address.getLine1()+","+address.getLine2()+","+address.getCity()+","+address.getPincode());
		((ClassPathXmlApplicationContext)context).close();
	}

}
