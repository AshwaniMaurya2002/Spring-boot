package com.ashwani.springdemo_application.Services;

import com.ashwani.springdemo_application.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//speccialization of component and tells that here we write the business logic
//  just to identify that this class perform business logic
@Service
public class EmployeeService {

    //this will help not to create new object
    @Autowired
    EmployeeRepository employeeRepository;
    public String getEmployee(){
        return  "employee";
    }
}
