package day17;

import java.util.Scanner;

public class DivisionWithLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int count=0;

        if (b>a) {
            int c = b;
            b = a;
            a = c;
        }
        while (a>=b){
            a-=b;
            count++;



        }

        System.out.println(count+" and remainder of "+a);


    }
}
