package com.wei.ticket;

public class Ticket {
    static final int TAIPEI_STATION = 100;
    static final int TAICHUNG_STATION = 200;
    static final int KAOHSIUNG_STATION = 300;

    int start;
    int destination;
    int price;
    float off1 = 0.2f;
    float off2 = 0.5f;
    float off3 = 0.1f;
    public Ticket(int start,int destination,int price){
        this.start=start;
        this.destination=destination;
        this.price=price;
    }
    public void print(){
        System.out.println();
    }
}
