package com.wei;

public class MemberLevel {
    public static void main(String[] args) {
        Member normal = new Member("0001",1200);
        Member silver = new Member("0002",800);
        normal.print();
        silver.print();
    }
}
