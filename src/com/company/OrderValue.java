package com.company;


public class OrderValue {

    private int orderValuePrices;

    private int discountRate;


    public OrderValue(int orderValuePrices, int discountRate) {

        this.orderValuePrices = orderValuePrices;
        this.discountRate = discountRate;

    }

    public void setOrderValuePrices(int orderValuePrices) {

    this.orderValuePrices = orderValuePrices;
    this.discountRate = discountRate;

    }

    public void setDiscountRate(int discountRate) {

        this.discountRate = discountRate;

    }

    public int getOrderValuePrices() {

        return orderValuePrices;



    }

    public int getDiscountRate() {

        return discountRate;


    }

    public String toString() {

        return "$" + orderValuePrices + " | " +  discountRate + "%";

    }





} // End brackets.
