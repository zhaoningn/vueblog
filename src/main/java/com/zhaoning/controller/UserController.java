package com.zhaoning.controller;


import com.zhaoning.common.lang.Result;
import com.zhaoning.entity.User;
import com.zhaoning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author anonymous
 * @since 2020-07-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.succ(200,"操作成功",user);
    }
}
