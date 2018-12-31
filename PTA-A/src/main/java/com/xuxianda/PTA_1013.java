package com.xuxianda;

import java.util.Scanner;

/**
 * Created by Xianda Xu on 2018/12/31.
 */
public class PTA_1013 {

    static boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i=3;i<=sqrt;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int []data = new int[end];
        data[0]=2;
        int index = 1,count=0;
        for(int i=3;index<end;i=i+2){
            if(isPrime(i)){
                data[index++]=i;
            }
        }
        for(int i=start-1;i<end;i++){
            System.out.print(data[i]);
            count++;
            if(count%10==0){
                System.out.println();
            }else if(count!=end-start+1){
                System.out.print(" ");
            }
        }
    }

}
