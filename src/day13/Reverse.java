package day13;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a 5 character string:");
         str= sc.nextLine();
        int length= str.length();
        if (length>5) System.out.println("Too long");
        else if (length<5 ) System.out.println("Too short");
        else {char ch0=str.charAt(0),
                ch1=str.charAt(1),
                ch2=str.charAt(2),
                ch3=str.charAt(3),
                ch4=str.charAt(4);

            System.out.println(""+ch4+ch3+ch2+ch1+ch0);
        }

        sc.close();
    }}
