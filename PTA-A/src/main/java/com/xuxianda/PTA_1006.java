package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1006 {

    static void print(int a,int n){
        int i;
        if(n==2){
            for (i = 0;i<new Integer(a);i++) {
                System.out.print("B");
            }
        }else if(n==1){
            for (i = 0;i<new Integer(a);i++) {
                System.out.print("S");
            }
        }else {
            for (i = 1;i<=new Integer(a);i++) {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        for (int i = 0 ; i<data.length();i++) {
            char c = data.charAt(i);
            print(new Integer(c)-48,data.length()-i-1);
        }
    }

}
