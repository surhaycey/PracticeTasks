package day13;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String username,pass;

        System.out.println("Username");
        username= sc.next();
        System.out.println("Password");
        pass= sc.next();

        boolean a,b;
        a=username.equals("Cydeo");
        b=pass.equals("WoodenSpoon");

        if(a&&b) System.out.println("Logged in." );
        else System.out.println("Incorrect username or password.");

    }
}
