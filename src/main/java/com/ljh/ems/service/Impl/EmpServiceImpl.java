package com.ljh.ems.service.Impl;

import com.ljh.ems.dao.EmpDao;
import com.ljh.ems.entity.Emp;
import com.ljh.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }

    @Override
    public void add(Emp emp) {
        empDao.add(emp);
    }

    @Override
    public void delete(String id) {
        empDao.delete(id);
    }

    @Override
    public Emp findOne(String id) {
        return empDao.findOneById(id);
    }

    @Override
    public void update(Emp emp) {
        empDao.update(emp);
    }
}
