
// to check if string contains only digits
package com.tgt.igniteplus;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        String s="[0-9]+";
        if(str.matches(s))
            System.out.println("String contains only digits");
        else
            System.out.println("String doesnot contain only digits");
        System.out.println(str.matches(s));


    }
}
