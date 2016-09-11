package com.xue.calculator;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Calculator {

    public void plus(int i,int j){
        int sum = i+j;
        System.out.println(sum);
    }

    public void plus(int i,double d){
        double sum =i+d;
        System.out.println(sum);
    }

    public void plus(double d,int i){
        double sum = d+i;
        System.out.println(sum);
    }

    public void plus(double d,double b){
        BigDecimal a = new BigDecimal(String.valueOf(d));
        BigDecimal c = new BigDecimal(String.valueOf(b));
        System.out.println(a.add(c));
    }
}
