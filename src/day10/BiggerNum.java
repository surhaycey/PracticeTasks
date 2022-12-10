package day10;

public class BiggerNum {
    public static void main(String[] args) {
        int n1=78,n2=20,n3=78;
       String res= (n1>n2 && n1>n3)? n1+" is bigger":(n3>n2 && n1<n3)?n3+" is bigger": (n2>n3 && n1<n2)?n2+" is bigger":"some are equal";

        System.out.println(res);

    }
}
