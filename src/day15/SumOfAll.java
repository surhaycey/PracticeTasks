package day15;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {

        int a,i,b=0;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        sc.close();
        for (i=0;i<=a;i++){
            b+=i;
        }
        System.out.println(b);
    }
}
