package day25;

import java.util.Arrays;

public class reverseArrOverload {
    public static void main(String[] args) {
       double[]arr={1,2,3,-78,879};
        System.out.println(Arrays.toString(reverseArr(arr)));

    }

    public static int[] reverseArr(int[]arr){
        int []newArr= new int[arr.length];
        int a=arr.length-1;
        for (int i : arr) {
            newArr[a--]=i;

        }
        return newArr;
    }
    public static double[] reverseArr(double[]arr){
        double []newArr= new double[arr.length];
        int a=arr.length-1;
        for (double i : arr) {
            newArr[a--]=i;

        }
        return newArr;
    }
    public static char[] reverseArr(char[]arr){
        char []newArr= new char[arr.length];
        int a=arr.length-1;
        for (char i : arr) {
            newArr[a--]=i;

        }
        return newArr;
    }
    public static String[] reverseArr(String[]arr){
        String []newArr= new String[arr.length];
        int a=arr.length-1;
        for (String i : arr) {
            newArr[a--]=i;

        }
        return newArr;
    }

}
