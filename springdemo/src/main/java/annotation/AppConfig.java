package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //starts spring container
@ComponentScan(basePackages = {"annotation"})
public class AppConfig {

	@Bean(name="std")
	public Student getStudentBean() {
		return new Student();
	}
}
