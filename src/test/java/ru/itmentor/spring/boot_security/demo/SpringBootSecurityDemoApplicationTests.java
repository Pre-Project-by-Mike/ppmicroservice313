package ru.itmentor.spring.boot_security.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = SpringBootSecurityDemoApplication.class)
@AutoConfigureMockMvc
class SpringBootSecurityDemoApplicationTests {
	public static void main(String... args) {

	}

	@Test
	void contextLoads() {
		ApplicationContext context = SpringApplication.run(SpringBootSecurityDemoApplication.class);
		System.out.println(context.getBean("encoder"));
		System.out.println(new BCryptPasswordEncoder().encode("qwerty"));

		//System.out.println(context.getBean("passwordEncoder").getClass().getName());

	}

}
