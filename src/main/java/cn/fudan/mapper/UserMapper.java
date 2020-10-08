package cn.fudan.mapper;

import cn.fudan.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> findAll();

    User selectOneById(@Param("id") String id);

    void save(User user);

    void deleteUserById(String id);

    void updateUserById(User user);
}
