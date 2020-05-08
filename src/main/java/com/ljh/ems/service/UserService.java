package com.ljh.ems.service;

import com.ljh.ems.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    void save(User user);
}
