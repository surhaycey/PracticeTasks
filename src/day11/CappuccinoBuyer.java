package day11;

public class CappuccinoBuyer {
    public static void main(String[] args) {


        String size = "venti";
        double price;
        int calories;

        if (size == "tall" || size == "grande" || size == "venti") {
            switch (size) {
                case "tall":
                    price = 3.69;
                    calories = 90;
                    break;
                case "grande":
                    price = 3.99;
                    calories = 120;
                    break;
                default:
                    price = 4.29;
                    calories = 150;
            }
            System.out.println(size + " cappuccino's price is $" + price + "\n" + calories + " calories");
        }else System.out.println("Invalid");
    }}