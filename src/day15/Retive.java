package day15;

import java.util.Scanner;

public class Retive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String");
        int a, c;
        String st;
        StringBuilder st1= new StringBuilder("letters:");
        StringBuilder st2= new StringBuilder("digits:");
        StringBuilder st3= new StringBuilder("special characters:");
        st= sc.nextLine();
        a=st.length();
        sc.close();



        for (c=0;c<=a-1;c++){
            if (st.charAt(c)>='a' && st.charAt(c)<='z' ){
                st1.append(st.charAt(c));

            } else if(st.charAt(c)>='A' && st.charAt(c)<='Z' ){
                st1.append(st.charAt(c));}

                else if((st.charAt(c)>='0' && st.charAt(c)<='9' )){
                st2.append(st.charAt(c));}
            else {
                st3.append(st.charAt(c));






        }
    }
        System.out.println(st);
        System.out.println(st1+"\n"+st2+"\n"+st3);}}

