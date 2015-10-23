package com.alibaba.webx.tutorial1.messageboard.dao.impl;

import com.alibaba.webx.tutorial1.messageboard.dao.MessageDAO;
import com.alibaba.webx.tutorial1.messageboard.dao.object.MessageDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class MessageDAOImpl  extends SqlMapClientDaoSupport implements MessageDAO {
    public boolean addMessage(MessageDO messageDO) {
        Object result = getSqlMapClientTemplate().insert("insertMessage", messageDO);
        return ((Integer) result > 0);
    }

    public MessageDO getMessageById(int id) {
        return (MessageDO) getSqlMapClientTemplate().queryForObject("selectById", id);
    }

    @SuppressWarnings("unchecked")
    public List<MessageDO> getMessageList(Map<String, Integer> map) {
        return getSqlMapClientTemplate().queryForList("selectBylist", map);
    }

    public boolean deleteMessageById(int id) {
        int result = getSqlMapClientTemplate().delete("deleteMessage", id);
        return (result > 0);
    }

    public boolean updateMessage(MessageDO messageDO) {
        int result = getSqlMapClientTemplate().update("updateMessage", messageDO);
        return (result > 0);
    }
}
