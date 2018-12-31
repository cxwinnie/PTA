package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }

}
