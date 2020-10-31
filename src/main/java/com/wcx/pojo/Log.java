package com.wcx.pojo;

import java.util.Date;

public class Log {
    private int logID;
    /**
     * 1:增加
     * 2：删除
     * 3：更新
     * 4：插入
     */
    private int operation;
    private int operator;
    private String operateDate;
    private String description;
    public int getOperator() {
        return operator;
    }
    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }
    public void setOperator(int operator) {
        this.operator = operator;
    }
    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logID=" + logID +
                ", operation=" + operation +
                ", operator=" + operator +
                ", operateDate='" + operateDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
