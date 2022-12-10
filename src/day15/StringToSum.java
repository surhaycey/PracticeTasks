package day15;

import java.util.Scanner;

public class StringToSum {
    public static void main(String[] args) {



    Scanner sc=new Scanner(System.in)   ;
    String  a=sc.nextLine();
    sc.close();
    int b=a.length()-1,c=0;

        for (int i=0;i<=b;i++){
        if((a.charAt(i)>='0' && a.charAt(i)<='9' )){
            switch (a.charAt(i)) {
                case '0':
                    c+=0;
                    break;
                case '1':
                    c+=1;
                    break;
                case '2':
                    c+=2;
                    break;
                case '3':
                    c+=3;
                    break;
                case '4':
                    c+=4;
                    break;
                case '5':
                    c+=5;
                    break;
                case '6':
                    c+=6;
                    break;
                case '7':
                    c+=7;
                    break;
                case '8':
                    c+=8;
                    break;
                case '9':
                    c+=9;
                    break;
                default:



            }
        }
        }

        System.out.println(c);
    }
}

