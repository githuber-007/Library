package com.wcx.pojo;
public class Manager {
    private int managerID;
    private String name;
    private String password;
    private String workNumber;
    private String tel;
    private int salary;

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerID=" + managerID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", tel='" + tel + '\'' +
                ", salary=" + salary +
                '}';
    }
}
