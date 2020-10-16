package example8;

import java.util.List;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){

				ApplicationContext context=new ClassPathXmlApplicationContext("CourseContext2.xml");
				Course course1=context.getBean("course1",Course.class);
				Course course2=context.getBean("course2",Course.class);
				Course course3=context.getBean("course3",Course.class);
				CourseList clist = new CourseList();
				clist.insert(course1);
				clist.insert(course2);
				clist.insert(course3);
				System.out.println(clist.discount());
				((ClassPathXmlApplicationContext)context).close();
			}

		

}


