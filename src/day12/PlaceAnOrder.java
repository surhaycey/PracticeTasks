package day12;
import java.util.Scanner;


public class PlaceAnOrder {
    public static void main(String[] args) {
        String product, name;
        int quantity;
        double price;

        Scanner sc= new Scanner(System.in);


        System.out.println("What is your name?");
         name=sc.nextLine();
        System.out.println("What is your order?");
        product= sc.nextLine();
        System.out.println("How many units?");
        quantity=sc.nextInt();
        System.out.println("What is the price of an unit?");
        price= sc.nextDouble();
        System.out.println(name+"your order for "+quantity+" "+product+" has been placed. Your total is "+(quantity*price));






    }

}
