package com.alibaba.webx.tutorial1.messageboard.service.impl;

import com.alibaba.webx.tutorial1.messageboard.dao.MessageDAO;
import com.alibaba.webx.tutorial1.messageboard.dao.object.MessageDO;
import com.alibaba.webx.tutorial1.messageboard.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;

    public boolean addMessage(MessageDO messageDO) {
        return messageDAO.addMessage(messageDO);
    }

    public MessageDO getMessageById(int id) {
        return messageDAO.getMessageById(id);
    }

    public List<MessageDO> getMessageList(Map<String, Integer> map) {
        return messageDAO.getMessageList(map);
    }

    public boolean deleteMessageById(int id) {
        return messageDAO.deleteMessageById(id);
    }

    public boolean updateMessage(MessageDO messageDO) {
        return messageDAO.updateMessage(messageDO);
    }
}
