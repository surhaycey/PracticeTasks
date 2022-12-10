package day22;

import java.util.Arrays;

public class ReverseTwoDimArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
        int a=0;
        for (int[] ints : arr) {

        int []temp=new int[ints.length];
        int x=ints.length-1;
        for (int i=0;i<temp.length;i++){
            temp[i]=ints[x];
            x--;

        }
        arr[a]=temp;
        a++;
    }



        int [][]temp=new int[arr.length][];


        int t=arr.length-1;

        for (int[] ints : arr) {
            temp[t]=ints;
            t--;

        }
        System.out.println(Arrays.deepToString(temp));


        }
}
