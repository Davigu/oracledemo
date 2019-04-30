package com.example.nuist.ordersys.demo.bo;

public class Order {
    private Long orderId;
    private Long sendId;
    private String sendAddress;
    private Long distributorId;
    private String receiveAddress;
    private Long receiveId;
    private String state;

    public Order() {
    }

    public Order(Long orderId, Long sendId, String sendAddress, Long distributorId, String receiveAddress, Long receiveId, String state) {
        this.orderId = orderId;
        this.sendId = sendId;
        this.sendAddress = sendAddress;
        this.distributorId = distributorId;
        this.receiveAddress = receiveAddress;
        this.receiveId = receiveId;
        this.state = state;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSendId() {
        return sendId;
    }

    public void setSendId(Long sendId) {
        this.sendId = sendId;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public Long getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public Long getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Long receiveId) {
        this.receiveId = receiveId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
