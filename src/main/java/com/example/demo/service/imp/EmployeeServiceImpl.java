package com.example.demo.service.imp;

import com.example.demo.constant.MessageConstant;
import com.example.demo.constant.StatusConstant;
import com.example.demo.controller.Employee;
import com.example.demo.exception.AccountLockedException;
import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.exception.PasswordErrorException;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.pojo.EmployeeLoginDTO;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

//@Service
//public class EmployeeServiceImpl implements EmployeeService {

    //@Autowired
    //private EmployeeMapper employeeMapper;

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return

    public Employee login(EmployeeLoginDTO employeeLoginDTO) {
        String username = employeeLoginDTO.getUsername();
        String password = employeeLoginDTO.getPassword();

        //1、根据用户名查询数据库中的数据
        //*Employee employee = employeeMapper.getByUsername(username);

        //2、处理各种异常情况（用户名不存在、密码不对、账号被锁定）
        if (employee == null) {
            //账号不存在
            throw new AccountNotFoundException(MessageConstant.ACCOUNT_NOT_FOUND);
        }

        //密码比对
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        if (!password.equals(employee.getPassword())) {
            //密码错误
            throw new PasswordErrorException(MessageConstant.PASSWORD_ERROR);
        }

        if (employee.getStatus() == StatusConstant.DISABLE) {
            //账号被锁定
            throw new AccountLockedException(MessageConstant.ACCOUNT_LOCKED);
        }

        //3、返回实体对象
        return employee;
    }
     */
//}
