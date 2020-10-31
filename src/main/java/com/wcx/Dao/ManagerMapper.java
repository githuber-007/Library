package com.wcx.Dao;

import com.wcx.pojo.Label;
import com.wcx.pojo.Manager;
import com.wcx.pojo.vo.ManagerVO;

import java.util.List;

public interface ManagerMapper {
    List<Manager> findAllManager();
    Manager findManagerByID(int id);
    Manager findManagerByName(String name);
    int deleteManagerByID(int id);
    int updateManager(Manager manager);
    int insertManager(Manager manager);

}
