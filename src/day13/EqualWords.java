package day13;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String st,st1,st2;

        System.out.println("Enter first word:");
        st=sc.nextLine();
        System.out.println("Enter second word:");
        st1=sc.nextLine();
        System.out.println("Enter third word:");
        st2=sc.nextLine();
        int stl,st1l,st2l;

        stl=st.length();
        st1l=st1.length();
        st2l=st2.length();

        boolean a,b,c;
        a=stl==st1l;
        b=st1l==st2l;
        c= st2l==stl;




        if(a&&b&&c) System.out.println("All words are same length");
        else if (a||b||c) System.out.println("Not Same nor Different lengths");
        else System.out.println("All different length");

        sc.close();
    }
}
