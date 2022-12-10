package day15;

import java.util.Scanner;

public class insurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price=0;

        System.out.println("Welcome to the Cydeo car insurance!");
        System.out.println("Enter your full name");
        String name=sc.nextLine();

        int nl=name.length();
        String ftl=name.substring(0,2);

        String refLast3=(name.substring(nl-3)).toUpperCase();
        System.out.println("Do you have a US driver license?");
        String hasL=sc.nextLine();
        if (hasL.equals("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);}
        System.out.println("Enter your zip code");
        int zipcode= sc.nextInt();
        if (zipcode==20910 ||zipcode==20740)price+=60;
        else if (zipcode==22102 ||zipcode==22103)price+=30;
        else price+=50;
        System.out.println("Is this vehicle owned, financed, or leased?");
        String owning=sc.next();
        switch (owning) {
            case "owned":
                price += 10;
                break;
            case "financed":
                price += 15;
                break;
            case "leased":
                price += 20;
                break;
            default:
                System.exit(0);
        }
        System.out.println("How is this vehicle primarily used?");
        String usage=sc.next();
        switch (usage) {
            case "business":
                price += 50;
                break;
            case "pleasure":
                price += 10;
                break;
            case "commuting":
                price += 20;
                System.out.println("How many days do you commute?");
                int comm = sc.nextInt();
                price += comm* 5;
                break;
            default:
                System.exit(0);
        }
        System.out.println("How old are you?");
        int age=sc.nextInt();
        if (age<16) {System.out.println("You can't be driving");
            System.exit(0);}
        else if(age<20)     price*=10;
        else if (age <25) price*=6;
        else price*=2;

        System.out.println("Have you had any accidents in the last 5 years?");
        String hadAcc= sc.next();
        if (hadAcc.equals("YES") ||hadAcc.equals("yes") ||hadAcc.equals("Yes") ){
            System.out.println("How many?");
            int acc=sc.nextInt();
            price+=acc*10;

        }
        System.out.println("What is the highest level of education you have completed?");
        sc.nextLine();
        String edu=sc.nextLine();
        if (edu.equals("Masters")) price*=0.95;
        else if (edu.equals("PHD")) price*=0.9;
        else price*=1.05;
        int a=name.length();
        int b=name.indexOf(" ");
        String fn=name.substring(0,b),
                ln=name.substring(b+1,a);

        String fi,li;
        fi=(fn.charAt(0)+"").toUpperCase();
        li=(ln.charAt(0)+"").toUpperCase();
        int fl=fn.length(),ll=ln.length();


        fn=fn.substring(1,fl).toLowerCase();
        ln=ln.substring(1,ll).toLowerCase();
        fn=fi+fn;
        ln=li+ln;

        String refEdu=edu.replaceAll(" ","");



        String refnum=""+ftl+age+refLast3+zipcode+refEdu;
        refnum=refnum.toUpperCase();
        System.out.println(fn+" "+ln+", here's your quote!");
        System.out.println("This is your start premium cost: $"+price);
        System.out.println("This is your reference number: "+refnum);

    }
}

