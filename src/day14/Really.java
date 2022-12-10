package day14;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Word");
        String word=sc.next();
        sc.close();
        int l=word.length();
        if ((""+word.charAt(l-2)+word.charAt(l-1)).equals("ly")) System.out.println("Really??");
        else System.out.println("Never Mind");


    }
}
