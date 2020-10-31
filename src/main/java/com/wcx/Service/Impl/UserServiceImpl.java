package com.wcx.Service.Impl;

import com.wcx.Dao.UserMapper;
import com.wcx.Service.UserService;
import com.wcx.pojo.User;
import com.wcx.pojo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findUserByID(int id) {
        return userMapper.findUserByID(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUserByID(int id) {
        return userMapper.deleteUserByID(id);
    }

    @Override
    public UserVo findRentedBookByUserID(int id) {
        return userMapper.findRentedBookByUserID(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
