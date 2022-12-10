package day13;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String passport;
        System.out.println("Do you have a valid passport?");
        passport= sc.next();
        if (passport.equals("yes")){
            int base=1000;
            System.out.println("Which country you are travelling to?");
            sc.nextLine();
            String country= sc.nextLine();
            System.out.println("How many bags you have?");
            byte bags=sc.nextByte();
            base+=bags*50;
            System.out.println("How many people you are traveling with?");
            short people=sc.nextShort();
            if (people<3 && people>=0) base-=people*100;
            else if (people>=3) base-=300;
            else {System.out.println("Invalid");
                System.exit(1);
            }
            System.out.println("\"Your ticket is booked to " +
                    country+". We have charged extra for the "+ bags+" bags but you are traveling with "+people+" so we are giving a discount. Your total cost is $"+base);

    }
        else if (passport.equals("no")){
            System.out.println("How many years ago did your passport expired?");
            short expDate= sc.nextShort();
            int cost=200;
            cost+=expDate*75;
            System.out.println("Where do you plan to travel?");
            sc.nextLine();
            String country=sc.nextLine();
            System.out.println("Will you be traveling next year?");
            String nextYear= sc.nextLine();
            if (nextYear.equals("yes"))cost+=100;
            else if (nextYear.equals("no"))cost+=50;
            else {System.out.println("invalid"); System.exit(1);}
            System.out.println("Looks like your password has been expired for "+expDate+" years but not to worry we will get it ready for you to travel to "+country+
                            ". Your total cost has come out to $"+cost);


        }
        else {
            System.out.println("invalid");
            System.exit(1);
        }
}}
