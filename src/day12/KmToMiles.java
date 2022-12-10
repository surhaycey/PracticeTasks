package day12;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double miles,kms;

        System.out.println("enter miles");
        miles=sc.nextInt();
        kms=miles*16.09;
        System.out.println(miles+" miles are equal to "+kms+" kilometers");
    }
}
