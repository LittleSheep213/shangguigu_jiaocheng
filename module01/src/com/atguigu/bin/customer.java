package com.atguigu.bin;

import java.util.ArrayList;
import java.util.Arrays;

public class customer {
    public static  void main(String[] args){
        System.out.println("Hello Customer");
        ArrayList list = new ArrayList();
        list.add(3);
        list.add("你好");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
