package com.xue.test;

import java.nio.channels.Pipe;
import java.util.*;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Test1 {

    public static void main(String[] args) {
        //字符串排序
       /* List list = new ArrayList();
        list.add("c");
        list.add("004");
        list.add("b");
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

        //字符串长度
       /* Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String len = s.next();
        System.out.println(sLen(len));*/

        //杨辉三角形
        int i,j;
        int a[][];
        a = new int[8][8];
        for(i=0;i<8;i++){
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for(i=2;i<8;i++){
            for(j=1;j<i;j++){
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        for(i=0;i<8;i++){
            for(j=0;j<i;j++){
                System.out.printf("     "+a[i][j]);
            }
            System.out.println();
        }
    }


    private static int sLen(String len) {
        return len.length();
    }
}
