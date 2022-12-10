package day09;

public class Salary {
    public static void main(String[] args) {
        double salary, tax = 0,salaryAfterTax;
        boolean isMarried;

        isMarried=true;
        salary=95000;





        if(isMarried){
            if(salary<=80000)tax=0.15;
            else if (salary>80000 && salary<=100000) tax=0.2;
            else if (salary>100000 && salary<=130000) tax=0.25;
            else if (salary>130000) tax=0.3;
        }
        else if(salary<=80000)tax=0.2;
        else if (salary>80000 && salary<=100000) tax=0.25;
        else if (salary>100000 && salary<=130000) tax=0.30;
        else if (salary>130000) tax=0.35;

        salaryAfterTax=salary-(salary*tax);

        System.out.println("salaryAfterTax = " + salaryAfterTax);





    }
}
