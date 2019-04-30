package com.example.nuist.ordersys.demo.bo;

public class Distributor {
    private Long distributorId;
    private Long orderId;

    public Distributor() {
    }

    public Distributor(Long distributorId, Long orderId) {
        this.distributorId = distributorId;
        this.orderId = orderId;
    }

    public Long getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
