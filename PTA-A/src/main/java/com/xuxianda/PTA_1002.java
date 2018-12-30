package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/30.
 */
public class PTA_1002 {

    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.next();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            char temp = n.charAt(i);
            Integer integer = new Integer(temp) - 48;
            sum += integer;
        }
        String str = sum+"";
        for (int i = 0 ;i<str.length();i++){
            char c = str.charAt(i);
            switch (c) {
                case '1':
                    System.out.print("yi");
                    break;
                case '2':
                    System.out.print("er");
                    break;
                case '3':
                    System.out.print("san");
                    break;
                case '4':
                    System.out.print("si");
                    break;
                case '5':
                    System.out.print("wu");
                    break;
                case '6':
                    System.out.print("liu");
                    break;
                case '7':
                    System.out.print("qi");
                    break;
                case '8':
                    System.out.print("ba");
                    break;
                case '9':
                    System.out.print("jiu");
                    break;
                case '0':
                    System.out.print("ling");
                    break;
            }
            if(i!=str.length()-1){
                System.out.print(" ");
            }
        }
    }

}
