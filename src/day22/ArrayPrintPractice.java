package day22;

import java.util.Arrays;

public class ArrayPrintPractice {
    public static void main(String[] args) {
        String [][]items={
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] item : items) {
            for (String s : item) {
                System.out.print(s +"\t");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                System.out.print(item[i]+ "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = items.length - 1; i >= 0; i--) {
            for (String s : items[i]) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }
    }
}
