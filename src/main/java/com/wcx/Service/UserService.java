package com.wcx.Service;

import com.wcx.pojo.User;
import com.wcx.pojo.vo.UserVo;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    User findUserByID(int id);
    int insertUser(User user);
    int updateUser(User user);
    UserVo findRentedBookByUserID(int id);
    int deleteUserByID(int id);
}
