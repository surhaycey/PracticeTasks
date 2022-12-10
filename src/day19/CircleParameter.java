package day19;

import java.util.Scanner;

public class CircleParameter {
    public static void main(String[] args) {
        String continuE="";

        do {
        System.out.println("Enter the radius of circle");
        Scanner sc=new Scanner(System.in);




        double radius= sc.nextDouble();
        if (radius<=0){
            System.out.println("invalid entry");
            System.exit(404);

        }
        System.out.println("diameter: "+radius*2);
        System.out.println("area: "+(3.141592*radius*radius));
        System.out.println("perimeter: "+(3.141592*2*radius));

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
                    c=a||b;


        }
} while (continuE.equals("yes"));




    }
}
