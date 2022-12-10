package day10;

public class AgeGroups {
    public static void main(String[] args) {
        int age=20;
        String res;

        if (age<=150 && age>0){
            if (age<21)res="Teenager";
            else if (age>=21 && age<55)res="Adult";
            else res= "Senior";
        }
        else res="Invalid";

        System.out.println(res);

        }
        }
