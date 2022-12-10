package day13;

import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence= sc.nextLine();
        char f,l;
        int length=sentence.length();

        f=sentence.charAt(0);
        l=sentence.charAt(length-1);
        System.out.println("First char is \""+f+"\" and last char is \""+l+"\"");
        int a;
        a= Integer.parseInt(sc.next());


        sc.close();
    }
}
