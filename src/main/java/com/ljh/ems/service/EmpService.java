package com.ljh.ems.service;


import com.ljh.ems.entity.Emp;
import com.ljh.ems.entity.User;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();

    void add(Emp emp);
}
