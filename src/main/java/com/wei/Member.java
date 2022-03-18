package com.wei;

public class Member {
    String level;
    int money ;
    float off = 0.1f;
    public Member(String level,int money){
        this.level = level;
        this.money = money;
    }
    public void print(){
        float offmoney = (money/1000)*off*1000;
        System.out.println(level+"\t"+money+"\t"+(money-offmoney));
    }
}
