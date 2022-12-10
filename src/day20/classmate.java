package day20;

import java.util.Arrays;
import java.util.Scanner;

public class classmate {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String cm[]=new String[10];
        for (int i=0;i<10;i++){


            System.out.println("Class mate "+(i+1));
            cm[i]=sc.nextLine();

        }
        for (int i=0; i<10;i++) System.out.println(cm[i]);

    }
}
