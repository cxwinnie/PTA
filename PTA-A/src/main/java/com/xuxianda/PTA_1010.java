package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {
            int xishu = scanner.nextInt();
            int zhishu = scanner.nextInt();
            if (xishu == 0 || zhishu == 0) {

            } else {
                if(count !=0){
                    System.out.print(" ");
                }
                System.out.print(xishu * zhishu + " " + (zhishu - 1));
                count++;
            }
        }
        if(count == 0){
            System.out.print("0 0");
        }
    }

}
