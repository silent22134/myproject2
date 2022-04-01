package com.wei.sales;

public class Golden extends Customer {
        public Golden(String level, int money){
                super(level,money);
                off = 0.2f;
        }
        @Override
        public void print(){
                System.out.println(level+"\t"+money+"\t"+(money-offmoney())+"("+offmoney()+")");
        }

}
