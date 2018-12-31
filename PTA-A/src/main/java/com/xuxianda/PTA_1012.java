package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1012 {

    public static void main(String[] args) {
        int A1=0,A2=0,A3=0,A4Count=0,A5=0,A2Flag=0;
        boolean []flag = new boolean[]{false,false,false,false,false};
        float A4 = 0f;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int k=0;k<n;k++){
            int i = scanner.nextInt();
            switch (i%5){
                case 0 :
                    if(i%2==0){
                        A1+=i;
                        flag[0] = true;
                    }
                    break;
                case 1 :
                    if(A2Flag%2 ==0){
                        A2+=i;
                    }else {
                        A2-=i;
                    }
                    A2Flag ++;
                    flag[1] = true;
                    break;
                case 2 :
                    A3++;
                    flag[2] = true;
                    break;
                case 3 :
                    A4Count++;
                    A4+=i;
                    flag[3] = true;
                    break;
                case 4 :
                    if(A5<i){
                        A5=i;
                    }
                    flag[4] = true;
                    break;
            }
        }
        for (int i=1;i<=5;i++) {
            if(flag[i-1]==false){
                System.out.print("N");
            }else {
                switch (i) {
                    case 1:
                        System.out.print(A1);break;
                    case 2:
                        System.out.print(A2);break;
                    case 3:
                        System.out.print(A3);break;
                    case 4:
                        System.out.print(String.format("%.1f",A4/A4Count));break;
                    case 5:
                        System.out.print(A5);break;
                }
            }
            if(i!=5){
                System.out.print(" ");
            }
        }
    }

}
