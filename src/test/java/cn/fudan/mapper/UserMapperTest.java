package cn.fudan.mapper;



import cn.fudan.Application;
import cn.fudan.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

   @Test
    public void findAll() {
       List<User> users = userMapper.findAll();
       for (User user : users) {
           System.out.println(user);
       }
       User user=new User("5","张三","法学院","法律");
          userMapper.updateUserById(user);

   }
   @Test
    public void findByPage(){
       PageHelper.startPage(1,5);
       List<User> users= userMapper.findAll();
       PageInfo<User> pageInfo=new PageInfo<>(users);
       for (User user : pageInfo.getList()) {
           System.out.println(user);
       }
   }
}