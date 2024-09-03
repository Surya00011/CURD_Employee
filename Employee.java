package com.surya;

public class Employee {
    private int empid;
    private String empname;
    private int salary;
    // To initialize Employee object
    Employee(int empid,String empname,int salary){
        this.empid=empid;
        this.empname=empname;
        this.salary=salary;
    }
    /* Since the instance variyables are in private in oder to
    access the we create getter methods here*/

    public int getEmpid() {
        return empid;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmpname() {
        return empname;
    }
    // Whenever user creates instance of Employee class we have to return employee details
    public String toString(){
        String s;
        s = "EmpID: " + empid + ",EmpName: " + empname + ",Salary: " + salary;
        return s;
    }
}
