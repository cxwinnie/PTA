package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/30.
 */
public class PTA_1003 {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        String string[] = new String[i];
        for (int j = 0; j < i; j++) {
            Scanner scannerTemp = new Scanner(System.in);
            string[j] = scannerTemp.next();
        }
        for (int j = 0; j < i; j++) {
            String str = string[i];
            if(!str.contains("P") || !str.contains("T") || !str.contains("A")){
                System.out.println("NO");
            }
            int p = 0;
        }

    }

}
