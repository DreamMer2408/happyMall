package com.happymall.user.service.Impl;

import com.happymall.user.bean.UmsMember;
import com.happymall.user.bean.UmsMemberReceiveAddress;
import com.happymall.user.mapper.UmsMemberMapper;
import com.happymall.user.mapper.UmsMemberReceiveAddressMapper;
import com.happymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wangs
 * @Date 2019/8/8 18:05
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper memberMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        return memberMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
