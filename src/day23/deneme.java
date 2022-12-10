package day23;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
       int c=0;
        for (int a = 0; a < 4; a++) {
            if (a==3)continue;
            for (int i = a+1; i < 5; i++) {
                c++;
                if (i==3) break;
            }

        }
        int a=5;
        int[]nums=new int[5];
        nums[2]=a--;
        nums[0]=a*2;
        nums[4]=--a+(a-9);
        nums=new int[5];
        nums[1]=nums[2];
        nums[3]=5;
        System.out.println(Arrays.toString(nums));

        }
    }
