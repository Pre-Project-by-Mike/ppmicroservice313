package ru.itmentor.spring.boot_security.demo.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.itmentor.spring.boot_security.demo.model.User;
import ru.itmentor.spring.boot_security.demo.service.UserService;


import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/{id}")
    public ResponseEntity<String> userInfo(Principal principal, @PathVariable String id) {
        // Проверяем, авторизован ли пользователь
     /**   if (principal == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        // Здесь вы можете получить объект User из вашей базы данных или другого места
        User user = userService.getUserById(id);

        // Проверяем, существует ли пользователь
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // Возвращаем найденного пользователя
        return ResponseEntity.ok(user);**/
        RestTemplate template = new RestTemplate();

     // Проверяем, авторизован ли пользователь
        if (principal == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        // Получаем id авторизованного пользователя
        String userId = principal.getName();

        // Создаем URL-адрес страницы пользователя с параметром id
        String userPageUrl = "/users/" + userId;

        // Возвращаем URL-адрес страницы пользователя
        return ResponseEntity.ok(userPageUrl);
    }
}