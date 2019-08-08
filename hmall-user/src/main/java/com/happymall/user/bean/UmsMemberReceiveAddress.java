package com.happymall.user.bean;

import javax.persistence.Id;

/**
 * @ClassName UmsMemberReceiveAddress
 * @Description TODO
 * @Author wangs
 * @Date 2019/8/8 17:58
 * @Version 1.0
 **/
public class UmsMemberReceiveAddress {

    @Id
    private String id;
    private String memberId;
    private String  name;           //收货人姓名
    private String  phoneNumber;    //手机号
    private int defaultStatus;      //是否为默认
    private String postCode;        //邮编
    private String province;        //省份/直辖市
    private String city;            //城市
    private String region;          //区
    private String detailAddress;   //详细地址

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(int defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}
