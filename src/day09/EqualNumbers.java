package day09;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1=1,n2=3,n3=3;
        if(n1==n2 && n2==n3) System.out.println("all equal");
        else if (n1==n2 && n1!=n3) System.out.println(n1+" and "+n2 +" are equal");
        else if (n1==n3 && n1!=n2) System.out.println(n1+" and "+n3 +" are equal");
        else if (n2==n3 && n1!=n2) System.out.println(n2+" and "+n3 +" are equal");
        else System.out.println("none are equal");

    }
}
