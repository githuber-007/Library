package com.wcx.Service.Impl;

import com.wcx.Dao.BookMapper;
import com.wcx.Service.BookService;
import com.wcx.pojo.Book;
import com.wcx.pojo.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper mapper;
    @Override
    public List<Book> findAllBook() {
        return mapper.findAllBook();
    }

    @Override
    public Book findBookByID(int id) {
        return mapper.findBookByID(id);
    }

    @Override
    public List<Book> findBookByName(String name) {
        return mapper.findBookByName(name);
    }

    @Override
    public int insertBook(Book book) {
        return mapper.insertBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return mapper.updateBook(book);
    }

    @Override
    public int deleteBookByID(int id) {
        return mapper.deleteBookByID(id);
    }

    @Override
    public int getTotal() {
        return mapper.getTotal();
    }

    @Override
    public BookVo findBookWithLabelByID(int id) {
        return mapper.findBookWithLabelByID(id);
    }
}
