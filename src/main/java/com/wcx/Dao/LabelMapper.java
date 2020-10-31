package com.wcx.Dao;

import com.wcx.pojo.Label;
import com.wcx.pojo.vo.LabelVo;

import java.util.List;

public interface LabelMapper {
    List<Label> findAllLabel();
    Label findLabelByID(int id);
    int deleteLabelByID(int id);
    int updateLabel(Label label);
    int insertLabel(Label label);
    LabelVo findLabelWithBookByID(int id);
}
