package com.huawei.od;

import java.util.*;

public class LastWordLength {
    public static void lastWordLength(){
        Scanner sc = new Scanner(System.in);
        String[] str = null;

        while(sc.hasNextLine()){
            str = sc.nextLine().split(" ");
            System.out.println(str[str.length-1].length());
        }

    }

    public static void main(String[] args) {
        LastWordLength.lastWordLength();
    }
}
