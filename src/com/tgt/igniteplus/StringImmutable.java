package com.tgt.igniteplus;

public class StringImmutable {
    public static void main(String args[]) {
        String s = "String";
        s.concat("is immutable");
        //prints only string,beacuse strings are immutable
        System.out.println(s);
    }
}
