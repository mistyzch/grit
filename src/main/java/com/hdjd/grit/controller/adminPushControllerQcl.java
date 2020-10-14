package com.hdjd.grit.controller;

import com.hdjd.grit.model.pojo.RO.AdminPushMessageRo;
import com.hdjd.grit.service.adminPushServiceQcl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@Api(description = "后台订阅消息接口")
@RestController
@RequestMapping("admin/message")
public class adminPushControllerQcl {
    @Autowired
    private adminPushServiceQcl adminPushServiceQcl;

    @PostMapping
    @ApiOperation(value = "管理员审核订单状态发送信息接口",response = AdminPushMessageRo.class)
    public String adminpushMessage(@RequestParam String userId,@RequestParam String title
            ,@RequestParam String remarks,@RequestParam String orderNumber) {
        if (userId != null && title != null
                && remarks != null && orderNumber != null) {
            return adminPushServiceQcl.pushOneUser(userId,title,remarks,orderNumber);
        }else {
            return "发送通知失败";
        }
    }

    @PostMapping("/adminpushMessageplus")
    @ApiOperation(value = "管理员审核订单状态发送信配送信息接口")
    public String adminpushMessageplus(@RequestParam String userId,@RequestParam String orderId,@RequestParam String status
            ,@RequestParam String driverName,@RequestParam String phoneNumber,@RequestParam String remarks) {
        if (orderId != null && status != null
                && remarks != null && driverName != null && phoneNumber != null) {
            return adminPushServiceQcl.pushOneUserplus(userId,orderId,status,remarks,driverName,phoneNumber);
        }else {
            return "发送通知失败";
        }
    }

}
