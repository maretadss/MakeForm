/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apaya.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
@Table(name = "customer")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId")
    , @NamedQuery(name = "Customer.findByCustomerName", query = "SELECT c FROM Customer c WHERE c.customerName = :customerName")
    , @NamedQuery(name = "Customer.findByCustomerEmail", query = "SELECT c FROM Customer c WHERE c.customerEmail = :customerEmail")
    , @NamedQuery(name = "Customer.findByCustomerTelepon", query = "SELECT c FROM Customer c WHERE c.customerTelepon = :customerTelepon")
    , @NamedQuery(name = "Customer.findByCustomerDob", query = "SELECT c FROM Customer c WHERE c.customerDob = :customerDob")
    , @NamedQuery(name = "Customer.findByCustomerTanggungan", query = "SELECT c FROM Customer c WHERE c.customerTanggungan = :customerTanggungan")
    , @NamedQuery(name = "Customer.findByCustomerGaji", query = "SELECT c FROM Customer c WHERE c.customerGaji = :customerGaji")
    , @NamedQuery(name = "Customer.findByCustomerPenghasilanTambahan", query = "SELECT c FROM Customer c WHERE c.customerPenghasilanTambahan = :customerPenghasilanTambahan")
    , @NamedQuery(name = "Customer.findByCustomerUpdatedby", query = "SELECT c FROM Customer c WHERE c.customerUpdatedby = :customerUpdatedby")
    , @NamedQuery(name = "Customer.findByCustomerCreatedby", query = "SELECT c FROM Customer c WHERE c.customerCreatedby = :customerCreatedby")
    , @NamedQuery(name = "Customer.findByCustomerCreatedtime", query = "SELECT c FROM Customer c WHERE c.customerCreatedtime = :customerCreatedtime")
    , @NamedQuery(name = "Customer.findByCustomerUpdatedtime", query = "SELECT c FROM Customer c WHERE c.customerUpdatedtime = :customerUpdatedtime")
    , @NamedQuery(name = "Customer.findByCustomerFlag", query = "SELECT c FROM Customer c WHERE c.customerFlag = :customerFlag")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_email")
    private String customerEmail;
    @Lob
    @Column(name = "customer_address")
    private String customerAddress;
    @Column(name = "customer_telepon")
    private String customerTelepon;
    @Column(name = "customer_dob")
    @Temporal(TemporalType.DATE)
    private Date customerDob;
    @Column(name = "customer_tanggungan")
    private Integer customerTanggungan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "customer_gaji")
    private double customerGaji;
    @Column(name = "customer_penghasilan_tambahan")
    private double customerPenghasilanTambahan;
    @Column(name = "customer_updatedby")
    private String customerUpdatedby;
    @Column(name = "customer_createdby")
    private String customerCreatedby;
    @Column(name = "customer_createdtime")
    private String customerCreatedtime;
    @Column(name = "customer_updatedtime")
    private String customerUpdatedtime;
    @Column(name = "customer_flag")
    private String customerFlag;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Double payment;

    public Customer() {
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerTelepon() {
        return customerTelepon;
    }

    public void setCustomerTelepon(String customerTelepon) {
        this.customerTelepon = customerTelepon;
    }

    public Date getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(Date customerDob) {
        this.customerDob = customerDob;
    }

    public Integer getCustomerTanggungan() {
        return customerTanggungan;
    }

    public void setCustomerTanggungan(Integer customerTanggungan) {
        this.customerTanggungan = customerTanggungan;
    }

    public double getCustomerGaji() {
        return customerGaji;
    }

    public void setCustomerGaji(double customerGaji) {
        this.customerGaji = customerGaji;
    }

    public double getCustomerPenghasilanTambahan() {
        return customerPenghasilanTambahan;
    }

    public void setCustomerPenghasilanTambahan(double customerPenghasilanTambahan) {
        this.customerPenghasilanTambahan = customerPenghasilanTambahan;
    }

    public String getCustomerUpdatedby() {
        return customerUpdatedby;
    }

    public void setCustomerUpdatedby(String customerUpdatedby) {
        this.customerUpdatedby = customerUpdatedby;
    }

    public String getCustomerCreatedby() {
        return customerCreatedby;
    }

    public void setCustomerCreatedby(String customerCreatedby) {
        this.customerCreatedby = customerCreatedby;
    }

    public String getCustomerCreatedtime() {
        return customerCreatedtime;
    }

    public void setCustomerCreatedtime(String customerCreatedtime) {
        this.customerCreatedtime = customerCreatedtime;
    }

    public String getCustomerUpdatedtime() {
        return customerUpdatedtime;
    }

    public void setCustomerUpdatedtime(String customerUpdatedtime) {
        this.customerUpdatedtime = customerUpdatedtime;
    }

    public String getCustomerFlag() {
        return customerFlag;
    }

    public void setCustomerFlag(String customerFlag) {
        this.customerFlag = customerFlag;
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
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apaya.entity.Customer[ customerId=" + customerId + " ]";
    }
    
}
