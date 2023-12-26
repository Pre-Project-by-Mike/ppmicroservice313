package ru.itmentor.spring.boot_security.demo;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import ru.itmentor.spring.boot_security.demo.configs.WebSecurityConfig;

@SpringBootTest(
		classes = SpringBootSecurityDemoApplication.class)
@AutoConfigureMockMvc
class SpringBootSecurityDemoApplicationTests {
	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigWebApplicationContext();
		System.out.println(context.getBean("encoder"));
		System.out.println(new BCryptPasswordEncoder().encode("qwerty"));
	}

	@Test
	void contextLoads() {
		ApplicationContext context = new AnnotationConfigWebApplicationContext();
		System.out.println(context.getBean("encoder"));
		System.out.println(new BCryptPasswordEncoder().encode("qwerty"));

		//System.out.println(context.getBean("passwordEncoder").getClass().getName());

	}

}
