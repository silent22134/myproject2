package com.wei;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name){
        this.name = name ;
    }
    public Student(String name,int english,int math){
        this(name);
        this.english = english;
        this.math = math;
    }
    public Student(){
        this("John Doe",-1,-1);
    }
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if(getAverage()<60){
            System.out.println("*");
        }
    }
    public int getAverage(){
        return(english+math)/2;
    }
}
