package day14;


import java.util.Scanner;

public class LastFirstLetter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        String fw,sw;
        System.out.println("First Word");
        fw= sc.next();
        System.out.println("First Word");
        sw=sc.next();
        sc.close();

      if (fw.endsWith(sw.charAt(0)+""))
        System.out.println(fw+sw.substring(1)+"");
      else System.out.println(fw+sw+"");




    }
}
