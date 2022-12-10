package day17;
import java.util.Scanner;


public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String itemName ,

                shoppingList = "",
                yesOrNo;

        double itemPrice,
                totalCost=0;
        int quantity,
                itemNumber = 0;

        do {
            System.out.println("Enter the name of item " + ++itemNumber);
            itemName = scan.next();

            System.out.println("Enter the price of " + itemName);
            itemPrice = scan.nextDouble();

            System.out.println("How many " + itemName + " will you buy?");
            quantity = scan.nextInt();

            System.out.println("Do you want to add more items to the shopping list?");
            yesOrNo = scan.next();

            shoppingList +="\n"+  itemName+ " x " + quantity + " - $" + itemPrice*quantity;
            totalCost+=itemPrice*quantity;
        }  while (yesOrNo.equals("yes"));



        System.out.println("SHOPPING LIST:"+shoppingList);

        System.out.println("Total cost: $" + totalCost) ;
    }

}

