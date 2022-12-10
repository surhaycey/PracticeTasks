package day13;

import java.util.Scanner;

public class FandLisSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st= sc.nextLine();
        int le=st.length();
        char f=st.charAt(0), l=st.charAt(le-1);
        if (f==l) System.out.println("same");
        else System.out.println("not same");

        sc.close();
    }
}
