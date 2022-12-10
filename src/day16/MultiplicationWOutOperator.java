package day16;

import java.util.Scanner;

public class MultiplicationWOutOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=0;


        for (int i = a; i > 0; i--) {
            c+=b;

        }
        System.out.println(c);
    }
}
