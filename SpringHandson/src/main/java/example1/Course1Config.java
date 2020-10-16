package example1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Course1Config {
		@Bean(name = "course1")
		public Course getCourse1() {
			Course course1=new Course();
			course1.setName("java");
			course1.setMentor("suresh");
			course1.setFee(2000);
			return course1;
		}
	}


