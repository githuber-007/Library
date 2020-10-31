package com.wcx.Service.Impl;

import com.wcx.Dao.LabelMapper;
import com.wcx.Service.LabelService;
import com.wcx.pojo.Label;
import com.wcx.pojo.vo.LabelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LableServiceImpl implements LabelService {
    @Autowired
    private LabelMapper mapper;
    @Override
    public List<Label> findAllLabel() {
        return mapper.findAllLabel();
    }

    @Override
    public Label findLabelByID(int id) {
        return mapper.findLabelByID(id);
    }

    @Override
    public int deleteLabelByID(int id) {
        return mapper.deleteLabelByID(id);
    }

    @Override
    public int updateLabel(Label label) {
        return mapper.updateLabel(label);
    }

    @Override
    public LabelVo findLabelWithBookByID(int id) {
        return mapper.findLabelWithBookByID(id);
    }

    @Override
    public int insertLabel(Label label) {
        return mapper.insertLabel(label);
    }
}
