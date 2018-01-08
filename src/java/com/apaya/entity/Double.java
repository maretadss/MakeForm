/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apaya.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "payment")
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findByPaymentId", query = "SELECT p FROM Payment p WHERE p.paymentId = :paymentId")
    , @NamedQuery(name = "Payment.findByPaymentPrice", query = "SELECT p FROM Payment p WHERE p.paymentPrice = :paymentPrice")
    , @NamedQuery(name = "Payment.findByPaymentCreatedby", query = "SELECT p FROM Payment p WHERE p.paymentCreatedby = :paymentCreatedby")
    , @NamedQuery(name = "Payment.findByPaymentUpdatedby", query = "SELECT p FROM Payment p WHERE p.paymentUpdatedby = :paymentUpdatedby")
    , @NamedQuery(name = "Payment.findByPaymentCreatedtime", query = "SELECT p FROM Payment p WHERE p.paymentCreatedtime = :paymentCreatedtime")
    , @NamedQuery(name = "Payment.findByPaymentUpdatedtime", query = "SELECT p FROM Payment p WHERE p.paymentUpdatedtime = :paymentUpdatedtime")
    , @NamedQuery(name = "Payment.findByPaymentFlag", query = "SELECT p FROM Payment p WHERE p.paymentFlag = :paymentFlag")})
public class Double implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_id")
    private Integer paymentId;
    @Basic(optional = false)
    @Column(name = "payment_price")
    private double paymentPrice;
    @Column(name = "payment_createdby")
    private String paymentCreatedby;
    @Column(name = "payment_updatedby")
    private String paymentUpdatedby;
    @Column(name = "payment_createdtime")
    private String paymentCreatedtime;
    @Column(name = "payment_updatedtime")
    private String paymentUpdatedtime;
    @Basic(optional = false)
    @Column(name = "payment_flag")
    private String paymentFlag;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @OneToOne(optional = false)
    private Customer customerId;
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    @OneToOne(optional = false)
    private Seller sellerId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentId")
    private Credit credit;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentId")
    private Cash cash;

    public Double() {
    }

    public Double(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Double(Integer paymentId, double paymentPrice, String paymentFlag) {
        this.paymentId = paymentId;
        this.paymentPrice = paymentPrice;
        this.paymentFlag = paymentFlag;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public String getPaymentCreatedby() {
        return paymentCreatedby;
    }

    public void setPaymentCreatedby(String paymentCreatedby) {
        this.paymentCreatedby = paymentCreatedby;
    }

    public String getPaymentUpdatedby() {
        return paymentUpdatedby;
    }

    public void setPaymentUpdatedby(String paymentUpdatedby) {
        this.paymentUpdatedby = paymentUpdatedby;
    }

    public String getPaymentCreatedtime() {
        return paymentCreatedtime;
    }

    public void setPaymentCreatedtime(String paymentCreatedtime) {
        this.paymentCreatedtime = paymentCreatedtime;
    }

    public String getPaymentUpdatedtime() {
        return paymentUpdatedtime;
    }

    public void setPaymentUpdatedtime(String paymentUpdatedtime) {
        this.paymentUpdatedtime = paymentUpdatedtime;
    }

    public String getPaymentFlag() {
        return paymentFlag;
    }

    public void setPaymentFlag(String paymentFlag) {
        this.paymentFlag = paymentFlag;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Seller getSellerId() {
        return sellerId;
    }

    public void setSellerId(Seller sellerId) {
        this.sellerId = sellerId;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Double)) {
            return false;
        }
        Double other = (Double) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apaya.entity.Payment[ paymentId=" + paymentId + " ]";
    }
    
}
