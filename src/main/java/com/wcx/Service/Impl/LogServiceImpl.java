package com.wcx.Service.Impl;

import com.wcx.Dao.LogMapper;
import com.wcx.Service.LogService;
import com.wcx.pojo.Log;
import com.wcx.pojo.vo.LogVo;
import com.wcx.pojo.vo.ManagerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper mapper;
    @Override
    public List<Log> findAllLog() {
        return mapper.findAllLog();
    }

    @Override
    public List<Log> findLogListByID(int id) {
        return mapper.findLogListByID(id);
    }

    @Override
    public int getTotal() {
        return mapper.getTotal();
    }

    @Override
    public int insertLog(Log log) {
        return mapper.insertLog(log);
    }

    @Override
    public LogVo getManager(int logID) {
        return mapper.getManager(logID);
    }

    @Override
    public ManagerVO findOperateLogByID(int id) {
        return mapper.findOperateLogByID(id);
    }
}
