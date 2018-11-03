package cn.leyou.consumer.dao;


import cn.leyou.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class UserDao {


    @Autowired
    private RestTemplate restTemplate;


    public User queryUserById(long id) {

        String url = "http://localhost:8081/user/" + id;

        return restTemplate.getForObject(url, User.class);

    }


}
