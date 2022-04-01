package com.wei.sales;

import java.util.ArrayList;
import java.util.List;

public class MemberLevel {
    public static void main(String[] args) {
        List<Customer>customers = new ArrayList<>();
        customers.add( new Customer("0001",1200));
        customers.add( new Customer("0002",800));
        customers.add( new Silver("0003",2000));
        customers.add( new Golden("0004",5000));
        customers.add( new Discount("0006",900));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (Customer c: customers){
            c.print();
        }
    }
}
