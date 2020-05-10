package com.ljh.ems.dao;


import com.ljh.ems.entity.Emp;
import com.ljh.ems.entity.User;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();

    void add(Emp emp);

    void delete(String id);
}
