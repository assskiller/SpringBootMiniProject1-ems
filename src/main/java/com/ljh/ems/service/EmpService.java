package com.ljh.ems.service;


import com.ljh.ems.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();

    void add(Emp emp);

    void delete(String id);

    Emp findOne(String id);

    void update(Emp emp);
}
