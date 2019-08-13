package com.microservice.communicationD.controller;

import com.microservice.communicationD.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author hexudong
 * @description 被调用接口
 * @date 2019-08-07
 */
@Api("CommunicationD的相关api")
@RestController
@RequestMapping("/CommunicationD")
public class CommunicationDController {

    @ApiOperation("根据用户名获取用户信息")
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(@RequestParam("username") String username) {

  /*      try {
            TimeUnit.MINUTES.sleep(2);//用于测试hystrix的超时响应
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        User user = null;
        if ("小明".equals(username)) {
            user = new User("小明", 20);
        } else {
            user = new User("小刚", 25);
        }
        return user;
    }
}
