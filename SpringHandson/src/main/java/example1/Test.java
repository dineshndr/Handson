package example1;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Test {

		public static void main(String[] args) {
			ApplicationContext context=new AnnotationConfigApplicationContext(Course1Config.class,Course2Config.class,Course3Config.class);
			Course course1=context.getBean("course1",Course.class);
			Course course2=context.getBean("course2",Course.class);
			Course course3=context.getBean("course3",Course.class);
			System.out.println("Course:"+course1.getName()+"\n"+"SME by:"+course1.getMentor()+"\n"+"Fee:"+course1.getFee());
			System.out.println("Course:"+course2.getName()+"\n"+"SME by:"+course2.getMentor()+"\n"+"Fee:"+course2.getFee());
			System.out.println("Course:"+course3.getName()+"\n"+"SME by:"+course3.getMentor()+"\n"+"Fee:"+course3.getFee());
			((AnnotationConfigApplicationContext)context).close();
		}

	}


