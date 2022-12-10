package day13;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int people;
        double tip, totalPay,eachPay,tipAmount,eachTip;
        String quality,split;
        System.out.println("Split?");
        split= sc.nextLine();

        if(split.equals("Yes")){
        System.out.println("Number of people?");
        people=sc.nextInt();}
        else if (split.equals("No"))people=1;
        else {
            System.out.println("Invalid");
            people=0;
            System.exit(0);

        }

        System.out.println("Check amount");
        totalPay= sc.nextDouble();
        sc.nextLine();
        System.out.println("How was the service quality?");
        quality=sc.nextLine();


        if (quality.equals("Poor")){tip=0.05;}
        else if (quality.equals("Fair")) {tip=0.1;}
        else if (quality.equals("Good")) {tip=0.15;}
        else if (quality.equals("Great")) {tip=0.2;}
        else if (quality.equals("Excellent")) {tip=0.25;}
        else {tip=0;
            System.out.println("Invalid");
        System.exit(0);}

        tipAmount=totalPay*tip;
        eachPay=totalPay/people;
        eachTip=tipAmount/people;



        if(split.equals("Yes")){
            System.out.println("Number of people: "+people+"\nTotal to pay: "+totalPay
            +"\nTotal tip: "+tipAmount+"\nTotal per person: "+eachPay+"\nTip per person: "+eachTip);

    } else {
            System.out.println("\nTotal to pay: "+totalPay
                    +"\nTotal tip: "+tipAmount);

        }
        sc.close();
    }}
