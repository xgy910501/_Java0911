package com.xue.test;

import javafx.scene.Parent;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Parents {
    {
        System.out.println("3.parent constructor block");
    }

    static {
        System.out.println("1.parent static block");
    }

    public Parents(){
        System.out.println("4.parent constructor");
    }

}

class Child extends Parents{
    {
        System.out.println("5.child constructor block");
    }

    static {
        System.out.println("2.child static block");
    }

    public Child(){
        System.out.println("6.child constructor");
    }
}

class test{
    public static void main(String[] args) {
        new Child();
    }
}
