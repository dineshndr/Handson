package example9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException,NumberFormatException,NullPointerException {

		ApplicationContext context=new ClassPathXmlApplicationContext("CourseContext1.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Course course1=context.getBean("course1",Course.class);
		Course course2=context.getBean("course2",Course.class);
		Course course3=context.getBean("course3",Course.class);
		CourseList clist = new CourseList();
		clist.insert(course1);
		clist.insert(course2);
		clist.insert(course3);
		clist.revenue();
		((ClassPathXmlApplicationContext)context).close();
	}

}
