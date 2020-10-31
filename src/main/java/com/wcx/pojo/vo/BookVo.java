package com.wcx.pojo.vo;

import com.wcx.pojo.Book;
import com.wcx.pojo.Label;

import java.util.List;

/**
 * 查询一本书的同时将其拥有的标签一块查出来
 */
public class BookVo extends Book {
    private List<Label> labels;
    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }
}
