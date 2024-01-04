package ru.itmentor.spring.boot_security.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import ru.itmentor.spring.boot_security.demo.controler.UserRestController;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.model.User;
import ru.itmentor.spring.boot_security.demo.service.RoleService;
import ru.itmentor.spring.boot_security.demo.service.RoleServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = SpringBootSecurityDemoApplication.class)
@AutoConfigureMockMvc
class SpringBootSecurityDemoApplicationTests {
	@PersistenceContext
	EntityManager entityManager;

	public static void main(String... args) {

	}

	@Test
	void contextLoads() {
		/*ApplicationContext context = SpringApplication.run(SpringBootSecurityDemoApplication.class);
		UserRestController controller = (UserRestController) context.getBean("userRestController");
		RoleService roleService = (RoleService) context.getBean("roleServiceImpl");
		Set<Role> roles = new HashSet<>();
		Role role = roleService.getRoleByName("ROLE_USER");
		entityManager.merge(role);
		roles.add(role);
		User user = controller.getUserById(6L).getBody();
		user.setUsername("mike");
		user.setPassword("qwerty");
		user.setRoles(roles);
		controller.createUser(user);
		user.getRoles().add(role);
		controller.getAllUsers().forEach(System.out::println);*/

		//System.out.println(new BCryptPasswordEncoder().encode("qwerty"));
		//System.out.println(context.getBean("passwordEncoder").getClass().getName());

	}

}
