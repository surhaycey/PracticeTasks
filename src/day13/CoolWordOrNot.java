package day13;

import java.util.Scanner;

public class CoolWordOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter a 3 letter word");

        String word= sc.nextLine();
        int l=word.length();


        if (l==3) {
            char m=word.charAt(1);

            switch (m){case 'a':
                System.out.println("cool word");
                break;
                default:
                    System.out.println("okay word");}
    }
        else if (l>3) System.out.println("too long");
        else System.out.println("too short");

        sc.close();
}}
