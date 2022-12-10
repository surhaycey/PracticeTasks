package day14;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        System.out.println("enter a word");
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        sc.close();
        boolean a,b,c;
        a=(word.charAt(0))>='a' &&(word.charAt(0))<='z';
        b=(word.charAt(0))>='A' &&(word.charAt(0))<='Z';
        c=(word.charAt(0))>='0' &&(word.charAt(0))<='9';

        if (a) System.out.println("first character is lowercase letter");
        else if (b) System.out.println("first character is uppercase letter");
        else if (c) System.out.println("first character is digit");
        else System.out.println("first character is special character");


    }
}
