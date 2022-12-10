package day09;

public class Calculator {
    public static void main(String[] args) {
        int n1=10,n2=2;
        String res;
        char operator='/';
       if(operator=='/' ||operator=='+' ||operator=='-' ||operator=='*' ) {
           if(operator=='/')res=""+(n1/n2);
        else if (operator=='*') res=""+(n1*n2);
        else if (operator=='+') res=""+(n1+n2);
        else res=""+(n1-n2);}
       else res="invalid";
        System.out.println(res);


    }
}
