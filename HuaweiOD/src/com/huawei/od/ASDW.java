package com.huawei.od;
import java.util.*;

public class ASDW {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String input=sc.nextLine();
                String[] str=input.split(";");
                int x = 0;
                int y = 0;
                for (int i = 0; i < str.length; ++i) {
                    if (checkLegal(str[i])) {
                        if(str[i].charAt(0)=='A'){
                            x=x-Integer.parseInt(str[i].substring(1));
                        }
                        else if(str[i].charAt(0)=='D'){
                            x=x+Integer.parseInt(str[i].substring(1));
                        }
                        else if(str[i].charAt(0)=='W'){
                            y=y+Integer.parseInt(str[i].substring(1));
                        }
                        else if(str[i].charAt(0)=='S'){
                            y=y-Integer.parseInt(str[i].substring(1));
                        }
                    }
                }
                System.out.println(x + "," + y);
            }
        }
        public static Boolean checkLegal(String s){
                int n=s.length();
                if(n<=3&&n>1){
                    if(s.charAt(0)=='A'||s.charAt(0)=='D'||s.charAt(0)=='W'||s.charAt(0)=='S'){
                        if(n==2&&Character.isDigit(s.charAt(1))){
                            return true;
                        }
                        else if(n==3&&Character.isDigit(s.charAt(1))&&Character.isDigit(s.charAt(2))){
                            return true;
                        }
                    }
                }
                return false;
            }
}
