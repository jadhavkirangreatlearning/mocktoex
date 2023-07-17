package com.csi.dao;

public class ArithmeticApplication {

    public static void main(String[] args) {

        ArithmeticApplication arithmeticApplication = new ArithmeticApplication();

        System.out.println("\n Addition Result: "+ arithmeticApplication.add(10, 20));
        System.out.println("\n Substraction Result: "+ arithmeticApplication.sub(60, 20));


    }

    public int add(int n1, int n2){
        return n1+n2;
    }

   public int sub(int n1, int n2){
        return n1-n2;
    }
}
