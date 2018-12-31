package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        String forth = scanner.nextLine();
        int i;
        for (i = 0; first.charAt(i) != '\0' && second.charAt(i) != '\0'; i++) {
            if (first.charAt(i) == second.charAt(i) && first.charAt(i) >= 'A' && first.charAt(i) <= 'G') {
                switch (first.charAt(i)) {
                    case 'A':
                        System.out.print("MON ");
                        break;
                    case 'B':
                        System.out.print("TUE ");
                        break;
                    case 'C':
                        System.out.print("WED ");
                        break;
                    case 'D':
                        System.out.print("THU ");
                        break;
                    case 'E':
                        System.out.print("FRI ");
                        break;
                    case 'F':
                        System.out.print("SAT ");
                        break;
                    case 'G':
                        System.out.print("SUN ");
                        break;
                }
                break;
            }
        }
        for (i = i + 1; first.charAt(i) != '\0' && second.charAt(i) != '\0'; i++) {
            if (first.charAt(i) == second.charAt(i) &&
                    (first.charAt(i) >= '0' && first.charAt(i) <= '9' || first.charAt(i) >= 'A' && first.charAt(i) <= 'N')) {
                if (first.charAt(i) <= '9') {
                    System.out.print("0" + first.charAt(i) + ":");
                } else {
                    System.out.print((first.charAt(i) - 55) + ":");
                }
                break;
            }
        }
        for (i = 0; third.charAt(i) != '\0' && forth.charAt(i) != '\0'; i++) {
            if (third.charAt(i) == forth.charAt(i) &&
                    (third.charAt(i) >= 'a' && third.charAt(i) <= 'z' || third.charAt(i) >= 'A' && third.charAt(i) <= 'Z')) {
                if (i < 10) {
                    System.out.print("0" + i);
                } else {
                    System.out.print(i);
                }
                break;
            }
        }
    }

}
