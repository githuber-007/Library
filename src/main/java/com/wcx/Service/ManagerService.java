package com.wcx.Service;

import com.wcx.pojo.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> findAllManager();
    Manager findManagerByID(int id);
    Manager findManagerByName(String name);
    int deleteManagerByID(int id);
    int updateManager(Manager manager);
    int insertManager(Manager manager);
}
