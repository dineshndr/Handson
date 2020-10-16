package example7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.*
;@Configuration
@Component
public class CourseConfig {
	@Bean(name="course1")
	public Course getCourse1()
	{
		Course course1 = new Course();
		course1.setName("java");
		course1.setMentor("ndr");
		course1.setFee(2000);
		return course1;
	}
	@Bean(name="course2")
	public Course getCourse2()
	{
		Course course2 = new Course();
		course2.setName("selenium");
		course2.setMentor("din");
		course2.setFee(1000);
		return course2;
	}
	@Bean(name="course3")
	public Course getCourse3()
	{
		Course course3 = new Course();
		course3.setName("python");
		course3.setMentor("ksr");
		course3.setFee(500);
		return course3;
	}
	
}
