package day17;

import java.util.Scanner;

public class CalculatorWithLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int res;

        System.out.println("enter an operator");
        String op=sc.next();
        while (!(op.equals("+")||op.equals("-")||op.equals("/")||op.equals("*"))){
            System.out.println("invalid");
            op=sc.next(); }
        switch (op){
            case "+":
                res=a+b;
                break;
            case "/":
                res=a/b;
                break;
            case "-":
                res=a-b;
                break;
            case "*":
                res=a*b;
                break;
            default:
                res=0;

        }
        System.out.println(res);



    }
}
