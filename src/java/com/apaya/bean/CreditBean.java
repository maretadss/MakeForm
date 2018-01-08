/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apaya.bean;

import com.apaya.entity.Double;

/**
 *
 * @author user
 */
public class CreditBean {
     
    private Double price;
    private Integer creditDuration;
    private Double basePrice;
    private Double interestRate;
    private Double downPayment;
    private Double total;
    private Double monthlyInstallment;

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the creditDuration
     */
    public Integer getCreditDuration() {
        return creditDuration;
    }

    /**
     * @param creditDuration the creditDuration to set
     */
    public void setCreditDuration(Integer creditDuration) {
        this.creditDuration = creditDuration;
    }

    /**
     * @return the basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return the interestRate
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return the downPayment
     */
    public Double getDownPayment() {
        return downPayment;
    }

    /**
     * @param downPayment the downPayment to set
     */
    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the monthlyInstallment
     */
    public Double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    /**
     * @param monthlyInstallment the monthlyInstallment to set
     */
    public void setMonthlyInstallment(Double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }
    
    
}
