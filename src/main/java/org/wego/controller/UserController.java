package org.wego.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wego.domain.User;
import org.wego.service.UserService;

import java.util.List;

/**
 * @author lst
 * @date 2023年05月12日 11:05
 */
//@Scope(value = "prototype")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getAllUser")
    public List<User> getAllUser() {
        return userService.list();
    }

    @PostMapping("insertUser")
    public Boolean insertUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping("deleteUser")
    public Boolean deleteUser(User user) {
        return userService.removeById(user);
    }


}
