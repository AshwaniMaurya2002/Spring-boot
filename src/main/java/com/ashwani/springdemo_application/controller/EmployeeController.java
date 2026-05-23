package com.ashwani.springdemo_application.controller;

import com.ashwani.springdemo_application.Entity.Employee;
import com.ashwani.springdemo_application.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//Restcontroller is the combination of Controller(used to make controller which take requestion from the client and provide the response) and response body(it tells that it return only body not render
//something )
@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

//    @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    @GetMapping("/getEmployee")
    public  String getEmployee(){
        return  employeeService.getEmployee();

    }

    @GetMapping("/getEmployeeByPathId/{id}")
    //path variable automatically map the path url to the function
    public  String getEmployeeByPathId(@PathVariable(name = "id") Integer employeeId){
        return  "Employee";

    }


    @GetMapping("/getEmployeeId")
    //request param passed the value present in the link

    public  String getEmployeeId(@RequestParam Integer employeeId){
        return  "Employee";

    }

//    @RequestMapping(path = "/addEmployee" ,method = RequestMethod.POST)
    //Done same things but new and more easy
    @PostMapping("/addEmployee")
    //request body automatically map the data passed to from the postman to the current employee
    public  String addEmployee(@RequestBody Employee employee){
        return  "Employee Added";

    }

    //old and hard way
    @RequestMapping(path = "/updateEmployee" ,method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        return  "Employee updated";
    }


    @RequestMapping(path = "/deleteEmployee" ,method = RequestMethod.DELETE)
    public String deleteEmployee(Employee employee){
        return  "Employee Deleted";
    }




}
