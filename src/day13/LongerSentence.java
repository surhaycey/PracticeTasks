package day13;

import java.util.Scanner;

public class LongerSentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first sentence:");
        String s1= sc.nextLine();
        System.out.println("Enter second sentence:");
        String s2=sc.nextLine();

        int l1=s1.length(),l2=s2.length();

        if(l1>l2) System.out.println("\""+s1+"\" is longer.");
        else if (l1<l2)System.out.println("\""+s2+"\" is longer.");
        else System.out.println("Equal.");

        sc.close();}
}
