package day15;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        //WRITE YOUR CODE BELOW
        int count=0;

        int a=str.length();
        for (int i=0;i<a-3;i++){
            char ch=str.charAt(i);
            String test=str.substring(i,i+2);
            if(test.equals(""+ch+ch+ch))++count;}

        System.out.println(count);


    }
}
