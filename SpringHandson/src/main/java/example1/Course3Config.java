package example1;	
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Course3Config {
			@Bean(name = "course3")
			public Course getCourse3() {
				Course course3=new Course();
				course3.setName("python");
				course3.setMentor("mahesh");
				course3.setFee(500);
				return course3;
			}
	}

