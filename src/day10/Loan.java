package day10;

public class Loan {
    public static void main(String[] args) {
        int salary=23, creditScore=52;
        String res=(salary>60000&& creditScore>=650)?"Loan Approved":"Loan Denied";


        System.out.println(res);
    }
}
