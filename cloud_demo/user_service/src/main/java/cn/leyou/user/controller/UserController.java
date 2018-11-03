package cn.leyou.user.controller;


import cn.leyou.user.pojo.User;
import cn.leyou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") long id) {

        return userService.quereyById(id);
    }
}
