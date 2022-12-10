package day19;

import java.util.Scanner;

public class Rectangle {public static void main(String[] args) {
    String continuE="";

    do {
        System.out.println("Enter the length of circle");
        Scanner sc=new Scanner(System.in);
        double length= sc.nextDouble();
        System.out.println("Enter the width of circle");
        double width= sc.nextDouble();
        if (width<=0){
            System.out.println("invalid entry");
            System.exit(404);

        }

        if (length<=0){
            System.out.println("invalid entry");
            System.exit(404);

        }

        System.out.println("area: "+(width*length));
        System.out.println("perimeter: "+(2*(length+width)));

        System.out.println("Would you like to calculate another circle?");
        continuE=sc.next();
        continuE=continuE.toLowerCase();
        boolean a=continuE.equals("yes"),
                b=continuE.equals("no"),
                c=a||b;


        if (b){
            System.out.println("Thank you for using Cydeo Circle Calculator APP");}
        else if (!c) {
            System.out.println("invalid, try again");
            continuE= sc.next();
            a=continuE.equals("yes");
            b=continuE.equals("no");



        }
    } while (continuE.equals("yes"));




}
}




