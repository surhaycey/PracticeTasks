package day14;

import java.util.Scanner;

public class AcoountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account number");
        String accNum = sc.next();
        sc.close();
        switch (accNum.charAt(0)) {
            case '2':
                if (accNum.length() == 7) System.out.println("OK");
                else System.out.println("Invalid account number");
                break;

            case '5':
                if (accNum.length() == 10) System.out.println("OK");
                else System.out.println("Invalid account number");
                break;
            default:
                System.out.println("Invalid account number");

        }
    }
}