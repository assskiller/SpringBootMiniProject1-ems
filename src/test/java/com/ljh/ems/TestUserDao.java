package com.ljh.ems;

import com.ljh.ems.dao.UserDao;
import com.ljh.ems.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest(classes = EmsApplication.class)
@RunWith(SpringRunner.class)
public class TestUserDao {

    @Autowired
    public UserDao userDao;

    @Test
    public void testSave()
    {
        userDao.save(new User("1","xiaolong","LongJunhua","123","男"));
    }

}
