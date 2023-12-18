package ru.itmentor.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 1) Перенесите классы и зависимости из предыдущей задачи.

 2) Создайте класс Role и свяжите User с ролями так, чтобы юзер мог иметь несколько ролей.

 3) Имплементируйте модели {{Role}} и {{User}} интерфейсами {{GrantedAuthority}} и {{UserDetails}} соответственно.
 	Измените настройку секьюрности с {{inMemory}} на {{userDetailService}}

 4) Все CRUD-операции должны быть доступны только пользователю с ролью admin по url: /admin/.
 	Добавление/изменение юзера должно быть с ролями за один запрос

 5) Пользователь с ролью user имеет доступ только по своему url /user и получать данные только о себе.
 	Доступ к этому url должен быть только у пользователей с ролью user и admin. Не забывайте про несколько ролей у пользователя!

 6) Настройте logout с любого url

 7) Необходимо установить Postman/Insomnia (на выбор) и разобраться как он работает

 8) С помощью Postman/Insomnia протестировать все endpoints.
 **/
@SpringBootApplication
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

}
