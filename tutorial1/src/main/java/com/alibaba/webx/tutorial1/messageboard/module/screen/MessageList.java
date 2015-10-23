package com.alibaba.webx.tutorial1.messageboard.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.webx.tutorial1.messageboard.dao.object.MessageDO;
import com.alibaba.webx.tutorial1.messageboard.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class MessageList {
    @Autowired
    private MessageService messageService;

    public void execute(@Param(name="message") String message,Context context){

        context.put("message", message);
        //获取登陆的用户名
        //查出一部分内容
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("from", 0);
        map.put("size", 10);

        List<MessageDO> messageList= messageService.getMessageList(map);

        if(messageList==null){
            context.put("message", "数据库操作失败！");
            return;
        }
        context.put("messageList", messageList);
    }
}
