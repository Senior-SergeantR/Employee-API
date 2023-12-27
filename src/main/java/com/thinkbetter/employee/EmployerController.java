package com.thinkbetter.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/empId")
public class EmployerController {
    @GetMapping("/{empId}")
    public String getEmployeeById(@PathVariable("empId") String empId){
        return "Employee details for id = "+ empId + " are NOT!!! found";
    }
}
