package com.wcx.pojo.vo;

import com.wcx.pojo.User;

import java.util.List;

public class UserVo extends User
{
    /**
     * 还未归还的书，即在rent表中保存的数据
     */
    private List<RentedBook> rentBooks;

    public List<RentedBook> getRentBooks() {
        return rentBooks;
    }

    public void setRentBooks(List<RentedBook> rentBooks) {
        this.rentBooks = rentBooks;
    }
}
