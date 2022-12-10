package day14;

import java.util.Scanner;

public class StartsWX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = sc.next();
        if (word.charAt(0) == 'x') System.out.println(word.substring(1));
    else System.out.println(word);}}