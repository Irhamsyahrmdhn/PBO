package com.pboreg;

public class Return_Values3 {
    static int myMethod(int x, int y){
        return x + y;
    }
    public static void main(String[] args){
        int z = myMethod(6,12);
        System.out.println(z);
    }
}
