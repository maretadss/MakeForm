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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "seller")
@NamedQueries({
    @NamedQuery(name = "Seller.findAll", query = "SELECT s FROM Seller s")
    , @NamedQuery(name = "Seller.findBySellerId", query = "SELECT s FROM Seller s WHERE s.sellerId = :sellerId")
    , @NamedQuery(name = "Seller.findBySellerName", query = "SELECT s FROM Seller s WHERE s.sellerName = :sellerName")
    , @NamedQuery(name = "Seller.findBySellerAddress", query = "SELECT s FROM Seller s WHERE s.sellerAddress = :sellerAddress")
    , @NamedQuery(name = "Seller.findBySellerPhone", query = "SELECT s FROM Seller s WHERE s.sellerPhone = :sellerPhone")
    , @NamedQuery(name = "Seller.findBySellerEmail", query = "SELECT s FROM Seller s WHERE s.sellerEmail = :sellerEmail")
    , @NamedQuery(name = "Seller.findBySellerItem", query = "SELECT s FROM Seller s WHERE s.sellerItem = :sellerItem")
    , @NamedQuery(name = "Seller.findBySellerCreatedby", query = "SELECT s FROM Seller s WHERE s.sellerCreatedby = :sellerCreatedby")
    , @NamedQuery(name = "Seller.findBySellerUpdatedby", query = "SELECT s FROM Seller s WHERE s.sellerUpdatedby = :sellerUpdatedby")
    , @NamedQuery(name = "Seller.findBySellerCreatedtime", query = "SELECT s FROM Seller s WHERE s.sellerCreatedtime = :sellerCreatedtime")
    , @NamedQuery(name = "Seller.findBySellerUpdatedtime", query = "SELECT s FROM Seller s WHERE s.sellerUpdatedtime = :sellerUpdatedtime")
    , @NamedQuery(name = "Seller.findBySellerFlag", query = "SELECT s FROM Seller s WHERE s.sellerFlag = :sellerFlag")})
public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seller_id")
    private Integer sellerId;
    @Column(name = "seller_name")
    private String sellerName;
    @Column(name = "seller_address")
    private String sellerAddress;
    @Column(name = "seller_phone")
    private String sellerPhone;
    @Column(name = "seller_email")
    private String sellerEmail;
    @Column(name = "seller_item")
    private String sellerItem;
    @Column(name = "seller_createdby")
    private String sellerCreatedby;
    @Column(name = "seller_updatedby")
    private String sellerUpdatedby;
    @Column(name = "seller_createdtime")
    private String sellerCreatedtime;
    @Column(name = "seller_updatedtime")
    private String sellerUpdatedtime;
    @Basic(optional = false)
    @Column(name = "seller_flag")
    private String sellerFlag;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "sellerId")
    private Double payment;

    public Seller() {
    }

    public Seller(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Seller(Integer sellerId, String sellerFlag) {
        this.sellerId = sellerId;
        this.sellerFlag = sellerFlag;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerItem() {
        return sellerItem;
    }

    public void setSellerItem(String sellerItem) {
        this.sellerItem = sellerItem;
    }

    public String getSellerCreatedby() {
        return sellerCreatedby;
    }

    public void setSellerCreatedby(String sellerCreatedby) {
        this.sellerCreatedby = sellerCreatedby;
    }

    public String getSellerUpdatedby() {
        return sellerUpdatedby;
    }

    public void setSellerUpdatedby(String sellerUpdatedby) {
        this.sellerUpdatedby = sellerUpdatedby;
    }

    public String getSellerCreatedtime() {
        return sellerCreatedtime;
    }

    public void setSellerCreatedtime(String sellerCreatedtime) {
        this.sellerCreatedtime = sellerCreatedtime;
    }

    public String getSellerUpdatedtime() {
        return sellerUpdatedtime;
    }

    public void setSellerUpdatedtime(String sellerUpdatedtime) {
        this.sellerUpdatedtime = sellerUpdatedtime;
    }

    public String getSellerFlag() {
        return sellerFlag;
    }

    public void setSellerFlag(String sellerFlag) {
        this.sellerFlag = sellerFlag;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellerId != null ? sellerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seller)) {
            return false;
        }
        Seller other = (Seller) object;
        if ((this.sellerId == null && other.sellerId != null) || (this.sellerId != null && !this.sellerId.equals(other.sellerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apaya.entity.Seller[ sellerId=" + sellerId + " ]";
    }
    
}
