package day25;

public class minNumOverload {
    public static void main(String[] args) {
        int[]arr={1,2,3,-78,879};
        System.out.println(minNum(arr));


    }
    public static int minNum(int[]arr){
        int minNum=arr[0];
        for (int i : arr) {
            if (i<minNum)minNum=i;

        }
        return minNum;
    }
    public static double minNum(double[]arr){
        double minNum=arr[0];
        for (double i : arr) {
            if (i<minNum)minNum=i;

        }
        return minNum;
    }
    public static long minNum(long[]arr){
        long minNum=arr[0];
        for (long i : arr) {
            if (i<minNum)minNum=i;

        }
        return minNum;
    }
    public static short minNum(short[]arr){
        short minNum=arr[0];
        for (short i : arr) {
            if (i<minNum)minNum=i;

        }
        return minNum;
    }
    public static float minNum(float[]arr){
        float minNum=arr[0];
        for (float i : arr) {
            if (i<minNum)minNum=i;

        }
        return minNum;
    }
    public static byte minNum(byte[]arr){
        byte minNum=arr[0];
        for (byte i : arr) {
            if (i<minNum)minNum=i;

        }
        return minNum;
    }
}

   