package com.example.RestfulAPI;

public class RestUser {

    private String empID, empName, empDesignation;


    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpID(){
        return empID;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpDesignation(String empDesignation){
        this.empDesignation = empDesignation;
    }

    public String getEmpDesignation(){
        return empDesignation;
    }

}
