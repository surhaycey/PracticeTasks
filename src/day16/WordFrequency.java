package day16;

import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println("enter a word"  );
        String word=sc.next();

        int frequency=0;

        str=str.toLowerCase();
        word=word.toLowerCase();



        while (str.contains(word)   ){
            str=str.replaceFirst(word, "");
            ++frequency;



        }
        System.out.println(frequency);
    }
}
