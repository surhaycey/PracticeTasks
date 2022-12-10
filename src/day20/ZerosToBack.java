package day20;

import java.util.Arrays;

public class ZerosToBack {
    public static void main(String[] args) {

        int array[]={2, 3, 0, 0, 5, 0, 8};

        int[] temp=new int [array.length];
        System.out.println(Arrays.toString(temp));
        int index=0;
        for (int i=0;i< array.length;i++){
            if(array[i]!=0){
                temp[index]=array[i];
                index++;

            }
        }

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(array));

    }}