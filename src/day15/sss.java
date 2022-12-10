package day15;

import java.util.Scanner;

public class sss {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int l = word.length();
        String middle;

        if (l%2==0) {


            middle =""+ word.charAt(l/2-1)+word.charAt(l/2);
        }else {

            middle=word.charAt(l/2)+"";}

        System.out.println(middle);


    }}