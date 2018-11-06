
package com.phanxuannam.shoesshop.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrdersEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String customerName;
    private String address;
    private String phone;
    private String date;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    Set<OrderDetailsEntity> orderDetails;
    
    @OneToOne
    @JoinColumn(name = "orderId")
    private PaymentsEntity payments;
    
    @OneToOne
    @JoinColumn(name = "orderId")
    private ShippingOrdersEntity shippingOrders;

    public OrdersEntity() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Set<OrderDetailsEntity> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetailsEntity> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public PaymentsEntity getPayments() {
        return payments;
    }

    public void setPayments(PaymentsEntity payments) {
        this.payments = payments;
    }

    public ShippingOrdersEntity getShippingOrders() {
        return shippingOrders;
    }

    public void setShippingOrders(ShippingOrdersEntity shippingOrders) {
        this.shippingOrders = shippingOrders;
    }
    
    
}
