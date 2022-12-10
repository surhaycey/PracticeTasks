package day19;

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        String cnt="";
        Scanner sc= new Scanner(System.in);


        do {
            System.out.println("Enter your hourly rate");
            double hourRate=sc.nextDouble();
            if (hourRate<=0){
                System.out.println("invalid ");
                System.exit(1);
            }
            System.out.println("How many hours you work a week?");
            int hour= sc.nextInt();
            if (hour<1 ||hour>144){
                System.out.println("invalid ");
                System.exit(1);
            }
            System.out.println("enter your state tax rate percentage");
            int stateTax= sc.nextInt();
            if (stateTax<0 ||stateTax>10){
                System.out.println("invalid ");
                System.exit(1);
            }

            double grossS=hour*hourRate*52,
                    fedTax=grossS*0.26,
                    stateT=grossS*stateTax;

            System.out.println("Gross salary: "+grossS);
            System.out.println("Federal tax: "+fedTax);
            System.out.println("State tax: "+stateT);
            System.out.println("Total tax: "+(fedTax+stateTax));
            System.out.println("Net income : "+(grossS-fedTax-stateTax));
            System.out.println();
            System.out.println("Continue?");
            cnt= sc.next();
            cnt = cnt.toLowerCase();
            if (cnt.equals("no")) System.out.println("Thank you for using Cydeo Salary Calculator APP");
            else if (!(cnt.equals("yes"))) {
                System.out.println("invalid entry");
                System.exit(1);

            }


        } while (cnt.equals("yes"));

        }
    }

