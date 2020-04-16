package com.tgt.igniteplus;

import java.util.Scanner;

//to check if string is empty
public class StringEmpty {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        System.out.println("".equals(str));
        if(str.isEmpty())
            System.out.println("string is empty");
        else
            System.out.println("string is not empty");

    }
}
