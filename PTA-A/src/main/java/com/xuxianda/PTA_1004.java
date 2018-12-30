package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/30.
 */
public class PTA_1004 {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        scanner.nextLine();
        String [][]data = new String[2][3];
        for (int j = 0; j < i; j++) {
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            if(j==0){
                data[0][0]=split[0];
                data[1][0]=split[0];
                data[0][1]=split[1];
                data[1][1]=split[1];
                data[0][2]=split[2];
                data[1][2]=split[2];
            } else {
                if(new Integer(data[0][2])> new Integer(split[2])){
                    data[0][0]=split[0];
                    data[0][1]=split[1];
                    data[0][2]=split[2];
                } else if(new Integer(data[1][2])< new Integer(split[2])){
                    data[1][0]=split[0];
                    data[1][1]=split[1];
                    data[1][2]=split[2];
                }
            }
        }
        System.out.println(data[1][0]+" "+data[1][1]);
        System.out.println(data[0][0]+" "+data[0][1]);
    }

}
