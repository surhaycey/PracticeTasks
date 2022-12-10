package day12;
import java.util.Scanner;


public class LivingWith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count;
        String res;



        System.out.println("How many people do you live with?");
        count= sc.nextInt();
        if (count<3) res="Live with less than 3 people";
        else if(count<=6) res="Live with 3 - 6 people";
        else res="Live with more than 6 people";
        System.out.println(res);


    }
}
