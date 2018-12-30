package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/30.
 */
public class PTA_1001 {


    public static void main(String[] args) throws Exception{
        int n ;
        int count=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }

}
