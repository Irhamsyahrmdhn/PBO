package com.pboreg;

public class A_Method_with_If_Else {
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied - you are not old enough!");
        }else{
            System.out.println("Access granted - you are old enough!");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}
