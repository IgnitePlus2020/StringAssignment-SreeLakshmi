package com.tgt.igniteplus;
import java.util.*;
public class StringLength {
    public static void main(String[] args) {
    int i=0;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=in.nextLine();
    char ch[]=str.toCharArray();
    for(char c : ch)
    {
        i++;
    }
    System.out.println("Length of the string = "+i);
}
}
