package day21;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[]arr1 = {30, 10, 20};
        int[]arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int i=arr1.length+ arr2.length+ arr3.length;
        int [] merged=new int[i];
        for (int a=0;a<i;a++){
            if (a< arr1.length)merged[a]=arr1[a];
            else if (a<arr1.length+ arr2.length) merged[a]=arr2[a-arr1.length];
            else merged[a]=arr3[a-arr1.length-arr2.length];
        }
        System.out.println(Arrays.toString(merged));


    }
}
