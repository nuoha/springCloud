package cn.leyou.consumer.service;


import cn.leyou.consumer.dao.UserDao;
import cn.leyou.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserByIds(List<Long> ids) {

        ArrayList<User> users = new ArrayList<>();

        for (long id : ids) {

            User user = userDao.queryUserById(id);
            users.add(user);
        }

        return users;
    }


}
