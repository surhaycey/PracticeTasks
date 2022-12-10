package day20;

import java.util.Scanner;

public class classmateReverse {
    public static void main(String[] args) {


            Scanner sc= new Scanner(System.in);

            String cm[]=new String[10];
            for (int i=0;i<10;i++){


                System.out.println("Class mate "+(i+1));
                cm[i]=sc.nextLine();

            }
            for (int i=0;i<10;i++){
                int a=cm[i].length()-1;
                String reverse="";


                for (;a>=0;a--){

                    reverse+=cm[i].charAt(a);



                }
                System.out.println(reverse);

                /*sc.close();
        int l=st.length()-1;
        for (; l>=0; l--){
            str+=st.charAt(l);

        }
        System.out.println(str);*/
            }
    }
}

