package com.example.demo.service;

import com.example.demo.controller.Employee;
import com.example.demo.pojo.EmployeeLoginDTO;

public interface EmployeeService {
    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);


}
