package day21;

import java.util.Arrays;

public class ArrayJavaPython {
    public static void main(String[] args) {
        String str="java java java java java python python python python ";
        str=str.toLowerCase();
        String []arr=str.split(" ");
        int java=0,pyt=0;

        for (String s : arr) {
            if (s.equals("java"))java++;
            if (s.equals("python"))pyt++;

        }
        System.out.println("Sentence has "+java+" \"java\" and "+pyt+"\"python\" in it.");


    }
}
