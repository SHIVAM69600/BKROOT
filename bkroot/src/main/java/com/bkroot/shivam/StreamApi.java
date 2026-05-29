package com.bkroot.shivam;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String [] args){
        List<Integer> list= Arrays.asList(12,43,45,1,4,2,4);
       List<Integer>number=  list.stream().sorted((a,b)->(a-b)).toList();
        System.out.println(number);
    }
}
