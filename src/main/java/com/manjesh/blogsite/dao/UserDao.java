package com.manjesh.blogsite.dao;

import com.manjesh.blogsite.model.Login;
import com.manjesh.blogsite.model.User;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 3/6/2017.
 */
public interface UserDao {
    void register(User user);

    User validateUser(Login login);
}
