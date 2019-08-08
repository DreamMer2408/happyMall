package com.happymall.user.service;

import com.happymall.user.bean.UmsMember;
import com.happymall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
