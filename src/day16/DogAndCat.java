package day16;

import java.util.Scanner;

public class DogAndCat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();


        int a=0,b=0;

        str=str.toLowerCase();




        while (str.contains("dog")   ){
            str=str.replaceFirst("dog", "");
            a++;



        }
        while (str.contains("cat")   ){
            str=str.replaceFirst("cat", "");
            b++;



        }

        System.out.println(a==b);

    }

}
