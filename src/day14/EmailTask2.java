package day14;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)   ;

        System.out.println("Email:");
        String email= sc.nextLine();
        sc.close();
        String name=email.substring(0, email.indexOf("_")),
                lastName=email.substring(email.indexOf("_")+1,email.indexOf("@") ),
                domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        String nfl=name.substring(0,1);
        {   nfl=nfl.toUpperCase();
            name=name.substring(1);
            name=name.toLowerCase();
            name=nfl+name+"";}

        String lfl=lastName.substring(0,1);
        { lfl=lfl.toUpperCase();

        lastName=lastName.substring(1);
        lastName=lastName.toLowerCase();
        lastName=lfl+lastName+"";}
        String dfl=domain.substring(0,1);
        { dfl=dfl.toUpperCase();

            domain=domain.substring(1);
            domain=domain.toLowerCase();
            domain=dfl+domain+"";}



        System.out.println(name);
        System.out.println(lastName);

        System.out.println(domain);
    }
}
