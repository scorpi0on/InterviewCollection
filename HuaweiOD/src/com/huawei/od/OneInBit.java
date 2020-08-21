package com.huawei.od;

import java.util.Scanner;

public class OneInBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println("Num is "+Integer.toBinaryString(num));
            while (num != 0){
                num = (num-1) & num;
                count ++;
            }
            System.out.println("num has "+count + " ones.");
        }
    }
}
