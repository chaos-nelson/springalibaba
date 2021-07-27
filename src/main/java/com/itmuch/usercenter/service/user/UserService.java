package com.itmuch.usercenter.service.user;

import com.itmuch.usercenter.dao.user.UserMapper;
import com.itmuch.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author JourWon
 * @date Created on 2021/7/27
 */
@Service
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class UserService {


    private final UserMapper userMapper;

    public User findById(Integer id){
        //select * from user where id=#{id}
        return this.userMapper.selectByPrimaryKey(id);
    }
}
