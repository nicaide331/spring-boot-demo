package com.zr.springboot.controller;

import com.zr.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author nicaide
 * @date 2020年12月15日 14:50:00
 */
@RestController("user")
public class UserController {

    @GetMapping("one")
    public User getUser() {
        User user = new User("name", "1");
        return user;
    }
}
