package com.wei.sales;

import com.wei.sales.Member;

public class MemberLevel {
    public static void main(String[] args) {
        Member customer1 = new Member("0001",1200);
        Member customer2 = new Member("0002",800);
        Member silver = new Member("0003",2000);
        Member golden = new Member("0004",5000);
        customer1.print();
        customer2.print();
        silver.print();
        golden.print();
    }
}
