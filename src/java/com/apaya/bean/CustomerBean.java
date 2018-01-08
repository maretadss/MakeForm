/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apaya.bean;

import java.util.Date;

/**
 *
 * @author user
 */
public class CustomerBean {
    private String name;
    private String email;
    private String address;
    private String telepon;
    private Date dateofBirth;
    private Integer attandance;
    private Double salary;
    private Double extraRevenue;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    /**
     * @return the dateofBirth
     */
    public Date getDateofBirth() {
        return dateofBirth;
    }

    /**
     * @param dateofBirth the dateofBirth to set
     */
    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * @return the attandance
     */
    public Integer getAttandance() {
        return attandance;
    }

    /**
     * @param attandance the attandance to set
     */
    public void setAttandance(Integer attandance) {
        this.attandance = attandance;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the extraRevenue
     */
    public Double getExtraRevenue() {
        return extraRevenue;
    }

    /**
     * @param extraRevenue the extraRevenue to set
     */
    public void setExtra_revenue(Double extraRevenue) {
        this.extraRevenue = extraRevenue;
    }
    
}
