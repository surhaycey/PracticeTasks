package day21;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int odd=0,even=0;
        for (int i : array) {
            if(i%2==0)even++;
            else odd++;

        }
        System.out.println("Array has "+even+" even number(s) and "+odd+" odd number(s)");
    }
}
