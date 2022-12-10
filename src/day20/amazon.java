package day20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class amazon {
    public static void main(String[] args) {
        String str="amazonian";
        char[] array=str.toCharArray();


        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
           if (i==0)System.out.print(array[i]);
           else System.out.print(array[i]+"-");



        }

    }
}
