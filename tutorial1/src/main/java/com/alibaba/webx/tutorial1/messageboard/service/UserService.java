package com.alibaba.webx.tutorial1.messageboard.service;

import com.alibaba.webx.tutorial1.messageboard.dao.object.UserDO;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public interface UserService {
    public boolean addUser(UserDO userDO);

    public boolean deleteUser(UserDO userDO);

    public UserDO getByUsername(String username);

    public boolean updateUser(UserDO userDO);
}
