package com.wei.score;

public class ScoringNew {
    public static void main(String[] args) {
        Student lisa = new Student("lisa",80,66);
        Student jennie = new Student("jennie",55,43);
        GraduateStudent reyna = new GraduateStudent("reyna",65,82,79);
        lisa.print();
        jennie.print();
        reyna.print();
    }
}
