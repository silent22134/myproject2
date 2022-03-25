package com.wei.score;

public class Scoring {
    public static void main(String[] args) {
        String[] name = {"lisa", "jennie", "reyna", "john", "june"};
        int[] english = {80, 55, 34, 91, 65};
        int[] math = {66, 43, 78, 95, 84};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + "\t" + english[i] + "\t" + math[i]+"\t"+(english[i]+math[i])/2);
        }
    }
}