package com.xuxianda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Xianda Xu on 2018/12/30.
 */
public class PTA_1005 {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        Integer[] nums = new Integer[i];
        Map<Integer, String> map = new HashMap<>();
        for (int j = 0; j < i; j++) {
            int num = scanner.nextInt();
            nums[j] = num;
            int n = num;
            while (n != 1) {
                String s = map.get(num);
                if (s == null) {
                    map.put(num, n + "");
                } else {
                    map.put(num, s + n);
                }
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = (3 * n + 1) / 2;
                }
            }
        }
        for (Integer num : nums) {
            String s = map.get(num);
            for (Integer temp : nums) {
                if (temp != num) {
                    if (map.get(num) != null && map.get(temp) != null && map.get(num).contains(map.get(temp))) {
                        map.remove(temp);
                    }
                }
            }
        }
        Integer finaldata[] = new Integer[map.size()];
        int count=0;
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            finaldata[count++] = (Integer) entry.getKey();
        }
        for(int j=1;j<count;j++){
            if(finaldata[j]>finaldata[j-1]){
                int temp = finaldata[j];
                int k;
                for(k=j-1;k>=0&&finaldata[k]<temp;k--){
                    finaldata[k+1] = finaldata[k];
                }
                finaldata[k+1] = temp;
            }
        }
        for(int j = 0 ; j<count;j++){
            System.out.print(finaldata[j]);
            if(j!=count-1){
                System.out.print(" ");
            }
        }
    }

}
