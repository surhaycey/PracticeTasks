package day20;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};







        int a=array.length-1;
        int b=a;
        int [] reverseArray=new int[a+1];
        for (int i=0;i<=a;i++){
            reverseArray[i]=array[b];
            b--;

        }

        System.out.println(Arrays.toString(reverseArray));






    }
}
