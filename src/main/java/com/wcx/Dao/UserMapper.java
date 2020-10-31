package com.wcx.Dao;

import com.wcx.pojo.User;
import com.wcx.pojo.vo.RentedBook;
import com.wcx.pojo.vo.UserVo;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser();
    User findUserByID(int id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUserByID(int id);
    UserVo findRentedBookByUserID(int id); //查询一个用户未归还的书籍名
}
