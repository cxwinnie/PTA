package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ;i<n;i++){
            Long A = scanner.nextLong();
            Long B = scanner.nextLong();
            Long C = scanner.nextLong();
            System.out.println("Case #"+(i+1)+": "+ ((A+B>C)?"true":"false"));
        }
    }

}
