package com.wcx.Dao;

import com.wcx.pojo.Rent;
import com.wcx.pojo.vo.RentVo;

import java.util.List;

public interface RentMapper {
    int insertARecord(Rent rent);
    int deleteARecord(int id);
    List<RentVo> queryAllRecords();
}
