package day25;

import java.util.Arrays;

public class mergeOverload {
    public static void main(String[] args) {
        String[]arr1={"1sad","2","3"};
        String[]arr2={"4","5","6"};
        String[]newArr=mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(newArr));


    }


    public static int[] mergeArrays(int[] arr1, int[]arr2){
        int i=0;
        int[]newArr= new int[arr1.length+ arr2.length];
        for (int i1 : arr1) {
            newArr[i]=i1;
            i++;
        }
        for (int i1 : arr2) {
            newArr[i]=i1;
            i++;
        }

        return newArr;
    }

    public static double[] mergeArrays(double[] arr1, double[]arr2){
        int i=0;
        double[]newArr= new double[arr1.length+ arr2.length];
        for (double i1 : arr1) {
            newArr[i]=i1;
            i++;
        }
        for (double i1 : arr2) {
            newArr[i]=i1;
            i++;
        }

        return newArr;
    }

    public static char[] mergeArrays(char[] arr1, char[]arr2){
        char i=0;
        char[]newArr= new char[arr1.length+ arr2.length];
        for (char i1 : arr1) {
            newArr[i]=i1;
            i++;
        }
        for (char i1 : arr2) {
            newArr[i]=i1;
            i++;
        }

        return newArr;
    }

    public static String[] mergeArrays(String[] arr1, String[]arr2){
        int i=0;
        String[]newArr= new String[arr1.length+ arr2.length];
        for (String i1 : arr1) {
            newArr[i]=i1;
            i++;
        }
        for (String i1 : arr2) {
            newArr[i]=i1;
            i++;
        }

        return newArr;
    }


}

