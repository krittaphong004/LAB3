package com.example.myapplication;

public class USERVIP extends USER{
    String viplv;
    double discountRate;

    public String getViplv(){
        return viplv;
    }
    public void setViplv(String viplv){
        this.viplv = viplv;
    }
    public double getDiscountRate(){
        return discountRate;
    }
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    public void print(){
        System.out.println(this.name + "," + this.viplv + "," + this.discountRate + "," + this.editdate + "," + this.createdate);
    }
}
