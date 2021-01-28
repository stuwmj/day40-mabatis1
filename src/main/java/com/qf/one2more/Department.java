package com.qf.one2more;

import java.util.List;

public class Department {
    private Integer did;
    private String dname;
    private List<Employee> emplist;

    public Department() {
    }

    public Department(Integer did, String dname, List<Employee> emplist) {
        this.did = did;
        this.dname = dname;
        this.emplist = emplist;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(List<Employee> emplist) {
        this.emplist = emplist;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", emplist=" + emplist +
                '}';
    }
}
