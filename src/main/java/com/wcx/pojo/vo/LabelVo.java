package com.wcx.pojo.vo;

import com.wcx.Dao.LabelMapper;
import com.wcx.pojo.Book;
import com.wcx.pojo.Label;

import java.util.List;

public class LabelVo extends Label {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
