package com.ye.service;

import com.ye.dao.UserDao;
import com.ye.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public List<User> getAll() {
        return userDao.getList();
    }
}
