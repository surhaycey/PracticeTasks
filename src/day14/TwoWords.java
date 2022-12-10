package day14;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fw,sw;
        System.out.println("First Word");
        fw= sc.next();
        System.out.println("First Word");
        sw=sc.next();

        fw=fw.substring(1);
        sw=sw.substring(1);

        System.out.println(fw+sw+"");

    }
}
