package com.wcx.pojo.vo;

public class RentVo  {
    private String rentDate;
    private String returnDate;
    private String BookName;
    private String userName;

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "RentVo{" +
                "rentDate='" + rentDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", BookName='" + BookName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
