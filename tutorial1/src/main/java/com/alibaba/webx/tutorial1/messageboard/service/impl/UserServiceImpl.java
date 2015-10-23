package com.alibaba.webx.tutorial1.messageboard.service.impl;

import com.alibaba.webx.tutorial1.messageboard.dao.UserDAO;
import com.alibaba.webx.tutorial1.messageboard.dao.object.UserDO;
import com.alibaba.webx.tutorial1.messageboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public boolean addUser(UserDO userDO) {
        return userDAO.addUser(userDO);
    }

    public boolean deleteUser(UserDO userDO) {
        return userDAO.deleteUser(userDO);
    }

    public UserDO getByUsername(String username) {
        return userDAO.getByUsername(username);
    }

    public boolean updateUser(UserDO userDO) {
        return userDAO.updateUser(userDO);
    }
}
