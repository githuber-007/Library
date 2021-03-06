package com.wcx.Service;

import com.wcx.pojo.Log;
import com.wcx.pojo.vo.LogVo;
import com.wcx.pojo.vo.ManagerVO;

import java.util.List;

public interface LogService {
    List<Log> findAllLog();
    List<Log> findLogListByID(int id);
    int getTotal();
    int insertLog(Log log);
    LogVo getManager(int logID);
    ManagerVO findOperateLogByID(int id);
}
