package com.wei.sales;

public class MemberLevel {
    public static void main(String[] args) {
        Customer customer1 = new Customer("0001",1200);
        Customer customer2 = new Customer("0002",800);
        Silver silver = new Silver("0003",2000);
        Golden golden = new Golden("0004",5000);
        Discount customer3 = new Discount("0006",900);
        Platinum plantium = new Platinum("0007",1000);
        customer1.print();
        customer2.print();
        silver.print();
        golden.print();
        customer3.print();
        plantium.print();
    }
}
