package day16;


import java.util.Scanner;

public class PosAndNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int posCount=0,negCount=0,zeroCount=0;
        System.out.println("enter 5 nums");
        int entry;
        for (int i = 0; i < 5; i++) {
            entry=sc.nextInt();

            if (entry<0)negCount++;
            else if (entry>0)posCount++;
            else zeroCount++;
        }

        System.out.println(posCount+" positive, "+negCount+" negative and "+zeroCount+" neutral(s).");

    }
}
