package com.ashwani.springdemo_application.Repository;


import org.springframework.stereotype.Repository;

//it tells that it is repo and talk to DB
@Repository
public class EmployeeRepository {

    public  String getEmployee(){
        return "remployee";
    }

}
