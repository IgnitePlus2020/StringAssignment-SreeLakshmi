package com.tgt.igniteplus;

public class StringRemove {
    public static void main(String[] args) {
        String str = "To test this string";
        str = str.toLowerCase();
        String res = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='t')
                continue;
            res = res.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println(res);
    }
}
