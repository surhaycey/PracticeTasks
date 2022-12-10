package day09;

public class AgeGroups {
    public static void main(String[] args) {
        int age=54;
        String res;
        if (age<=120 && age >=0){
           res= (age<=2)? "Infant":(age<=5&&age>=3)?"Toddler":(age<=9&&age>=6)?"Kid":
                    (age<=12&&age>=10)?"Pre-Teen":(age<=17&&age>=13)?"Teenager":(age<=20&&age>=18)?"Young Adult":
                            (age<=39&&age>=21)?"Adult":(age<=49&&age>=40)?"Young Middle-Aged Adult":(age<=54&&age>=50)?"Middle-Aged Adult":
                                    (age<=64&&age>=55)?"Very Young Senior Citizen":(age<=74&&age>=65)?"Young Senior Citizen":(age<=84&&age>=75)?"Senior Citizen":"Old Senior Citizen";
        }
        else res="invalid";
        System.out.println(res);

    }
}
