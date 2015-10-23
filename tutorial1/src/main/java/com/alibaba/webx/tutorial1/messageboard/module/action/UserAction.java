package com.alibaba.webx.tutorial1.messageboard.module.action;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.tutorial1.messageboard.dao.object.UserDO;
import com.alibaba.webx.tutorial1.messageboard.module.vo.UserVO;
import com.alibaba.webx.tutorial1.messageboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by wb-chenchaobin on 2015/10/23.
 */
public class UserAction {
    @Autowired
    private UserService userService;

    //登陆
    public void doLogin(@FormGroup("login") UserVO user,Context context, Navigator nav){

        String username=user.getUsername();
        String password=user.getPassword();

        UserDO userdo=null;
        boolean success;

        //根据用户名获得用户记录
        userdo=userService.getByUsername(username);
        if(userdo==null){
            context.put("message", "用户名不存在!");
            nav.forwardTo("index");
            return;
        }

        //校验密码是否正确
        if(password.equals(userdo.getPassword())){
            success=true;
        }
        else{
            success=false;
        }

        //判断执行转向和重定向
        if(success){
            context.put("username", user.getUsername());
            nav.forwardTo("message/messageList");
        }else{
            context.put("message", "密码错误!");
            nav.forwardTo("index");
        }
    }

    //退出
    public void doLogout(Navigator nav) {
        //退出操作
        //转到首页
        nav.redirectTo("messageBoardLink").withTarget("index");
    }
}
