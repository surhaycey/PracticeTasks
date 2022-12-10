package day15;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number");
    int n,i,b,c;
    n= sc.nextInt();
    sc.close();
    b=n-1;
    c=n;


    for (i=1;i<c;i++){
        n=b*n;
        --b;




    }
        System.out.println(n);
}}
