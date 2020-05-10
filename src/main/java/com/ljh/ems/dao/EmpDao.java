package com.ljh.ems.dao;


import com.ljh.ems.entity.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();
}
