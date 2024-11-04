package gwangju.ac.kr.cloud_spring;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudSpringApplication {

	public static void main(String[]args) {
		SpringApplication.run(CloudSpringApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			
			System.out.println("스프링부트에서 빈즈 가져오기");
			
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
