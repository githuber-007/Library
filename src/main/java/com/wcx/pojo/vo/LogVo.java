package com.wcx.pojo.vo;
import com.wcx.pojo.Log;
import com.wcx.pojo.Manager;

/**
 * 用于查询一条log记录对应的Manager信息
 * manager_log表与manager表连接查询
 */
public class LogVo extends Log{
    private Manager manager;
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "LogVo{" +
                "manager=" + manager +
                '}';
    }
}
