package day07;

public class SwitchVariables {
    public static void main(String[] args) {
        int a,b,temp;
        a=10;
        b=15;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
