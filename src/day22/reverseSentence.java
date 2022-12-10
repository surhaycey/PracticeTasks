package day22;

import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {
        String str="Today is a good day to learn Java.";
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));

        String reverse=" ";
        for (int i = words.length - 1; i >= 0; i--) {
           reverse+= words[i];


        }
        System.out.println(reverse);

        for (String word : words) {

        }


    }
}
