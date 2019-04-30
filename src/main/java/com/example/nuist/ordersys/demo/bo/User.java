package com.example.nuist.ordersys.demo.bo;

public class User {
    private long userId;
    private String userName;
    private String userAddress;
    private Long userPhone;
    private String userPassword;

    public User(long userId, String userName, String userAddress, Long userPhone, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
    }

    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
