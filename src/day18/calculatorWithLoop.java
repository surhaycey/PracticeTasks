package day18;

import java.util.Scanner;

public class calculatorWithLoop {
    public static void main(String[] args) {
        String continuE;
        do {
        System.out.println("enter first number");
        Scanner sc= new Scanner(System.in);
        int firstNum=sc.nextInt();
        System.out.println("enter an operator");
        String ope= sc.next();
        char operator=ope.trim().charAt(0);
        boolean a=operator=='+'||operator=='/'||operator=='*'||operator=='-',
                b=ope.length()==1;



    while (!a || !b) {
        System.out.println("Enter a valid operator");
        ope = sc.next();
        operator = ope.trim().charAt(0);
        a = operator == '+' || operator == '/' || operator == '*' || operator == '-';
        b = ope.length() == 1;

    }
    System.out.println("enter second number");

    int secondNum = sc.nextInt();

    int res;

    switch (operator) {
        case '+':
            res = firstNum + secondNum;
            break;
        case '/':
            res = firstNum / secondNum;
            break;
        case '*':
            res = firstNum * secondNum;
            break;
        case '-':
            res = firstNum - secondNum;
            break;
        default:
            res = 0;

    }
    System.out.println(res);
    System.out.println("do you want to continue?");
    continuE = sc.next();
    continuE = continuE.toLowerCase();
    boolean ca = continuE.equals("yes"),
            cb = continuE.equals("no");
    while (!(ca || cb)) {
        System.out.println("invalid entry try again");
        continuE = sc.next();
        continuE = continuE.toLowerCase();
        ca = continuE.equals("yes");
        cb = continuE.equals("no");

    }
}while (continuE.equals("yes"));





    }
}
