package day19;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        String continuE="";

        do {
            System.out.println("Enter the side of circle");
            Scanner sc=new Scanner(System.in);




            double side= sc.nextDouble();
            if (side<=0){
                System.out.println("invalid entry");
                System.exit(404);

            }

            System.out.println("area: "+(side*side));
            System.out.println("perimeter: "+(4*side));

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


