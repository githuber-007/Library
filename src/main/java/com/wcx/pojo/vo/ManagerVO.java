package com.wcx.pojo.vo;

import com.wcx.pojo.Log;
import com.wcx.pojo.Manager;

import java.util.List;

/**
 * 同时查找manager信息和他对应的操作记录
 */
public class ManagerVO extends Manager {
    private List<Log> logList;
    public List<Log> getLogList() {
        return logList;
    }

    public void setLogList(List<Log> logList) {
        this.logList = logList;
    }
}
