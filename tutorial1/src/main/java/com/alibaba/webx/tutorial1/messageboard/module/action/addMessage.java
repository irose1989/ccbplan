package com.alibaba.webx.tutorial1.messageboard.module.action;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class addMessage {
    public void execute(@Param(name="message") String message,Context context){
        context.put("message", message);
    }
}
