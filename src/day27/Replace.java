package day27;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

        replace(arr,2,30);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] replace(int[]array, int index, int newEl){
        if (index<0||index>array.length-1){
            System.err.println("invalid index: "+index);
            System.exit(0);
        }
        array[index]=newEl;
        return array;



    }

}
