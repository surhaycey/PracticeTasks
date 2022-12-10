package ReplitsNTries;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a factorial/number");

        String entry=sc.next();

        if (entry.contains("!")){
        entry=entry.substring(0,entry.length()-1);
        }
        int num=Integer.parseInt(entry);

       int res=1;

        for (int i = 1; i <= num; i++) {
            res*=i;



        }
        System.out.println(res);



    }
}
