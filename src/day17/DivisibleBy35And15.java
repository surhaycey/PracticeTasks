package day17;

import java.util.Scanner;

public class DivisibleBy35And15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        String str3="Divisible By 3 :",str5="Divisible By 5 :",str15="Divisible By 15 :";

        while (a!=0){
            if (a % 15 == 0)str15+=a+", ";
            else if (a % 3 == 0)str3+=a+", ";
            else if (a % 5 == 0)str5+=a+", ";
            a--;
        }
        System.out.println(str3);
        System.out.println(str5);
        System.out.println(str15);

        }

}
