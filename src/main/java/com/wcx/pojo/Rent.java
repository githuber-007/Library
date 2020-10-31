package com.wcx.pojo;

public class Rent {
    private int userID;
    private int bookID;
    private int rentID;
    private String rentDate;
    private String returnDate;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

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

    @Override
    public String toString() {
        return "Rent{" +
                "userID=" + userID +
                ", bookID=" + bookID +
                ", rentID=" + rentID +
                ", Date='" + rentDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
