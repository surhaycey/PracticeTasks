package day14;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Email:");
        String email= sc.nextLine();
        sc.close();
        if (email.contains("_"))
        {String name=email.substring(0, email.indexOf("_")),
                lastName=email.substring(email.indexOf("_")+1,email.indexOf("@") ),
            domain=email.substring(email.indexOf("@"));

            System.out.println(lastName+"_"+name+domain);
        }
        else System.out.println(email);
    }
}
