package example4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.hcl.example8"})
@Configuration
public class UserConfig {

	@Bean("order1")
	public Order getOrder1() {
		
		return(new Order("Tv",2000.0));
	}
	
	@Bean("order2")
	public Order getOrder2() {
		
		return(new Order("Mobile",32000.0));
	}
	
	@Bean("user")
	public User getUser() {
		User user = new User();
		user.setName("dinesh");
		user.setAge(20);
		user.setCity("Chennai");
		return user;
		
	}
}
