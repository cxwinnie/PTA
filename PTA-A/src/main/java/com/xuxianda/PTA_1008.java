package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] data = new int[m + n];
        for (int i = 0; i < n; i++) {
            data[i + m] = scanner.nextInt();
        }
        for (int i = n; i < m + n; i++) {
            data[i % n] = data[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }

}
