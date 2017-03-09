package com.manjesh.blogsite.service;

import com.manjesh.blogsite.dao.UserDao;
import com.manjesh.blogsite.model.Login;
import com.manjesh.blogsite.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 3/6/2017.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
