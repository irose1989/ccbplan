package com.alibaba.webx.tutorial1.messageboard.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.webx.tutorial1.messageboard.dao.object.MessageDO;
import com.alibaba.webx.tutorial1.messageboard.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class ModifyMessage {
    @Autowired
    private MessageService messageService;

    public void execute(@Param(name="messageId")int messageId,Context context){

        MessageDO messageDO;

        messageDO = messageService.getMessageById(messageId);

        if(messageDO==null){
            context.put("message", "获取数据失败！");
        }
        else{
            context.put("messageDO", messageDO);
        }
    }
}
