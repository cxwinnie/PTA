package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1007 {

    static boolean sqrt(int n){
        int sqrt= (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        int finalResult = 0;
        int data[] = new int[n];
        for(int i=3;i<=n;i=i+2){
            if(sqrt(i)){
                data[count++] = i;
            }
        }
        for (int i=1;i<count;i++){
            if(data[i]-data[i-1]==2){
                finalResult++;
            }
        }
        System.out.println(finalResult);
    }

}
