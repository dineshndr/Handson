package example10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages={"com.hcl.example5"})
@Configuration
public class OwnerConfig {

	@Bean
	public Owner setOwner() {
		Owner owner = new Owner();
		return owner;
	}
}