package cn.leyou.user.service;


import cn.leyou.user.mapper.UserMapper;
import cn.leyou.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User quereyById(long id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
