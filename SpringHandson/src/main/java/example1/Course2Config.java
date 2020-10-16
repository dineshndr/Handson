package example1;	
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Course2Config {
			@Bean(name = "course2")
			public Course getCourse2() {
				Course course2=new Course();
				course2.setName("selenium");
				course2.setMentor("dinesh");
				course2.setFee(1000);
				return course2;
			}
	}


