package com.example.springdocker;

/**
 * Created by Patrik Melander
 * Date: 2021-05-12
 * Time: 13:44
 * Project: SoloProject
 * Copyright: MIT
 */
public class MyMathCalc {
    public int add (int a, int b){
        return a+b;
    }
    public int multiply (int a, int b){
        return a*b;
    }
    public double divided (int a, int b){
        if (a == 0 || b == 0){
            throw new ArithmeticException("Can not divide with 0");
        }
        return a/b;
    }
}
