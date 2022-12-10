package day21;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array={1,2,866,74,75,457,4,5};
        Arrays.sort(array);
        int[] temp=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            temp[i]=array[j];
            j++;

        }
        array=temp;

        System.out.println(Arrays.toString(array));
    }
}
