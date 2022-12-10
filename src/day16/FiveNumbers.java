package day16;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =5, y, pos=0,neg=0;



        while (x!=0 ){
            y= sc.nextInt();

            if (y>0) pos+=1;
            else if (y<0) neg+=1;
            else ;

            x--;


        }
        System.out.println(pos+" positive and "+neg+" negative number.");
    }
}
