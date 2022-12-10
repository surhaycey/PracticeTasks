package day13;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();
        int ln;
        char f,l;
        ln=name.indexOf(" ")+1;
        f=name.charAt(0);
        l=name.charAt(ln);


        System.out.println(f+"."+l);


        sc.close();


    }
}
