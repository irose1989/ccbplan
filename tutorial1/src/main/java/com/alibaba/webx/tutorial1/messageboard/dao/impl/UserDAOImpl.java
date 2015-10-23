package com.alibaba.webx.tutorial1.messageboard.dao.impl;

import com.alibaba.webx.tutorial1.messageboard.dao.UserDAO;
import com.alibaba.webx.tutorial1.messageboard.dao.object.UserDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO{
    public boolean addUser(UserDO userDO) {
        Object result = getSqlMapClientTemplate().insert("insertUser", userDO);
        return ((Integer) result > 0);
    }

    public boolean deleteUser(UserDO userDO) {
        int result = getSqlMapClientTemplate().delete("deleteuser", userDO);
        return (result > 0);
    }

    public UserDO getByUsername(String username) {
        return (UserDO) getSqlMapClientTemplate().queryForObject("selectByUsername", username);
    }

    public boolean updateUser(UserDO userDO) {
        int result = getSqlMapClientTemplate().update("updateuser", userDO);
        return (result > 0);
    }
}
