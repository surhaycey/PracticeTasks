package day13;

import java.util.Scanner;

public class LastThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word or a sentence");
        String st= sc.nextLine();
        if (st.isEmpty()) System.out.println("Empty");
        else {
            int a= st.length();
            char l,sl,tl;
            l= st.charAt(a-1);
            sl= st.charAt(a-2);
            tl=st.charAt(a-3);
            System.out.println(""+tl+sl+l);
        }
        sc.close();
    }
}
