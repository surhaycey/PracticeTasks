package day22;


import java.util.Arrays;

public class maxArray {
    public static void main(String[] args) {
        int[] array={12,4,5,0,54,7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        System.out.println(array[array.length-1]);
}}
