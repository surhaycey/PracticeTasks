package day17;

import java.util.Scanner;

public class SumUntilNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number" );
        int a,b=0;
        a=sc.nextInt();
        while (a>0){b+=a;
            System.out.println(b);
            System.out.println("enter a number" );
            a=sc.nextInt();


    }
}}
