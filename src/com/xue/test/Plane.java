package com.xue.test;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Plane extends Vehicle{
    String planeType;
    String airLine;
    String airPort;

    public void fly(){

    }

    public void transport(){
        super.transport();
        System.out.println("飞机运输、。。");
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.transport();
    }
}
