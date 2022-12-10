package day15;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("String");
        String st=sc.nextLine();
        String str="";


        sc.close();
        int l=st.length()-1;
        for (; l>=0; l--){
            str+=(st.charAt(l));


        }
        boolean c=(st.equals(str));

        System.out.println(c);
    }
}