package com.alibaba.webx.tutorial1.messageboard.service;

import com.alibaba.webx.tutorial1.messageboard.dao.object.MessageDO;

import java.util.List;
import java.util.Map;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public interface MessageService {
    public boolean addMessage(MessageDO messageDO);

    public MessageDO getMessageById(int id);

    public List<MessageDO> getMessageList(Map<String, Integer> map);

    public boolean deleteMessageById(int id);

    public boolean updateMessage(MessageDO messageDO);
}
