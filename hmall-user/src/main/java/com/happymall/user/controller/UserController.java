package com.happymall.user.controller;

import com.happymall.user.bean.UmsMember;
import com.happymall.user.bean.UmsMemberReceiveAddress;
import com.happymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangs
 * @Date 2019/8/8 18:11
 * @Version 1.0
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    public ResponseEntity<List<UmsMember>> getAllUser(){
        List<UmsMember> umsMemberList=userService.getAllUser();
        return ResponseEntity.ok(umsMemberList);
    }

    /**
     * 根据用户id查询收货地址
     * @param memberId
     * @return
     */
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public ResponseEntity<List<UmsMemberReceiveAddress>> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> list=userService.getReceiveAddressByMemberId(memberId);
        return ResponseEntity.ok(list);
    }

}
