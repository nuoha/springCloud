package cn.leyou.consumer.contorller;


import cn.leyou.consumer.pojo.User;
import cn.leyou.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {


    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> queryList(@RequestParam("ids") List<Long> ids) {

        List<User> userList = userService.queryUserByIds(ids);

        return userList;


    }


}
