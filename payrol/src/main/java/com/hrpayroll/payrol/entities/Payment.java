package com.hrpayroll.payrol.entities;

import java.io.Serializable;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getName() {
        return this.name;
    }

    public Double getDailyIncome() {
        return this.dailyIncome;
    }

    public Integer getDays() {
        return this.days;
    }

    public double getTotal() {
        return days * dailyIncome;
    }
}
