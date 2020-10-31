package com.wcx.Service.Impl;

import com.wcx.Dao.ManagerMapper;
import com.wcx.Service.ManagerService;
import com.wcx.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper mapper;

    @Override
    public List<Manager> findAllManager() {
        return mapper.findAllManager();
    }

    @Override
    public Manager findManagerByID(int id) {
        return mapper.findManagerByID(id);
    }

    @Override
    public Manager findManagerByName(String name) {
        return mapper.findManagerByName(name);
    }

    @Override
    public int deleteManagerByID(int id) {
        return mapper.deleteManagerByID(id);
    }

    @Override
    public int updateManager(Manager manager) {
        return mapper.updateManager(manager);
    }

    @Override
    public int insertManager(Manager manager) {
        return mapper.insertManager(manager);
    }
}
