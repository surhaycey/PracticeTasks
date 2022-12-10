package day15;

public class SumOfOdd  {
    public static void main(String[] args) {
        int a=0,i;
        for (i=0;i<=100;i++){
            if (i%2==1) a+=i;

        }
        System.out.println(a);
    }
}
