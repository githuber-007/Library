package com.wcx.Service;

import com.wcx.pojo.Book;
import com.wcx.pojo.vo.BookVo;

import java.util.List;

public interface BookService {
    List<Book> findAllBook();
    Book findBookByID(int ID);
    List<Book> findBookByName(String name);
    int insertBook(Book book);
    int updateBook(Book book);
    int deleteBookByID(int id);
    int getTotal();
    BookVo findBookWithLabelByID(int id);
}
