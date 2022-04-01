package com.wei.sales;

public class Customer {
    String level;
    int money ;
    float off = 0.1f;
    public Customer(String level, int money){
        this.level = level;
        this.money = money;
    }
    public float offmoney(){
        return(money/1000)*off*1000;
    }
    public void print(){
        System.out.println(level+"\t"+money+"\t"+(money-offmoney()));
    }
}
