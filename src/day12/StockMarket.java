package day12;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double netWorth;
        int shares;
        String company;
        System.out.println("How many stock shares you already have?");
        shares= sc.nextInt();
        if (shares>0){
            System.out.println("What is the net worth of your total shares?");
            netWorth= sc.nextDouble();
            sc.nextLine();
            System.out.println("Which company you have the most shares?");
            company= sc.nextLine();
            System.out.println("Your total stock market holding is $"+netWorth+" which is made up of "+shares+" shares. "+company+" is your company holdings");
        }
        else System.out.println("You have no shares");


    }
}
