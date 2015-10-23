package com.alibaba.webx.tutorial1.messageboard.module.action;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.tutorial1.messageboard.dao.object.UserDO;
import com.alibaba.webx.tutorial1.messageboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class RegisterAction {
    @Autowired
    private UserService userService;

    //用户注册
    public void doRegister(@FormGroup(name="register") UserDO user,
                           Context context,Navigator nav ){
        //检查已存在用户名,可以用jquery实现
        UserDO reserDO =userService.getByUsername(user.getUsername());
        if(reserDO!=null){
            context.put("message", "用户名已存在，请重新注册！");
            nav.forwardTo("register");
            return;
        }
        //保存用户注册
        UserDO userDO = new UserDO();
        userDO.setUsername(user.getUsername());
        userDO.setPassword(user.getPassword());
        boolean result=false;
        result = userService.addUser(userDO);

        if(result){
            context.put("username", user.getUsername());
            nav.forwardTo("message/messageList");
        }else{
            context.put("message", "注册失败！");
            nav.forwardTo("register");
        }
    }
}
