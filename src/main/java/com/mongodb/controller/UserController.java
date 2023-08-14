package com.mongodb.controller;

import com.mongodb.entitiy.User;
import com.mongodb.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // bean'in tüm bağımlılıkları enjekte edildikten sonra otomatik çalıştırılır.
    @PostConstruct
    void init() {
        userService.removeAll();
        User user = new User();
        user.setName("zeynep");
        user.setLastname("uygun");
        userService.save(user);

    }

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping(value = "/get/id={id}")
    public ResponseEntity<Object> getById(@PathVariable(value = "id") String id) {
        User user = userService.findById(id);
        if (user == null) {
            return ResponseEntity.badRequest().body("User bulunamadı!");
        }
        return ResponseEntity.ok(user);
    }

    @DeleteMapping(value = "/remove/id={id}")
    public ResponseEntity<Object> removeById(@PathVariable(value = "id") String id) {
        User user = userService.removeById(id);
        if (user == null) {
            return ResponseEntity.badRequest().body("Silme işlemi başarısız. Doğru id 'yi girdiğinizden emin olunuz.");
        }
        return ResponseEntity.ok(user.getId());
    }
}

