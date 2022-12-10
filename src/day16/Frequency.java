package day16;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in)  ;
        
        String str,ch;
        int frequency=0;




        System.out.println("Enter a String");
        str=sc.nextLine();
        System.out.println("Enter a character");
        ch= sc.next();

while (str.contains(ch)) {
    str=str.replaceFirst(ch, "");
    frequency += 1;
}
        System.out.println(frequency);
}







    }
