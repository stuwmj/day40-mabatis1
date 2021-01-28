package com.qf.one2more;

public class Employee {
    private Integer eid;
    private String ename;
    private Department dep;

    public Employee() {
    }

    public Employee(Integer eid, String ename, Department dep) {
        this.eid = eid;
        this.ename = ename;
        this.dep = dep;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dep=" + dep +
                '}';
    }
}
