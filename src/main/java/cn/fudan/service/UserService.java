package cn.fudan.service;

import cn.fudan.entity.User;
import cn.fudan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findAll(){
        return userMapper.findAll();
    }

    public void Save(User user) {
        userMapper.save(user);
    }
    public void  deleteUserById(String id){
        userMapper.deleteUserById(id);
    }
    public User selectOneById(String id){
        return userMapper.selectOneById(id);
    }

    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }
}
