package day12;
import java.util.Scanner;


public class CentToDollar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cent, dollar, change;
        System.out.println("how many cents do you have?");
        cent= sc.nextInt();
        dollar= cent/100;
        change=cent%100;
        System.out.println(cent+" is equal to "+dollar+" and "+ change+" cents.");


    }
}
