package day25;

public class maxNumOverload {
    public static void main(String[] args) {
        int[]arr={1,2,3,-78,879};


    }
    public static int maxNum(int[]arr){
        int maxNum=arr[0];
        for (int i : arr) {
            if (i>maxNum)maxNum=i;

        }
        return maxNum;
    }
    public static double maxNum(double[]arr){
        double maxNum=arr[0];
        for (double i : arr) {
            if (i>maxNum)maxNum=i;

        }
        return maxNum;
    }
    public static long maxNum(long[]arr){
        long maxNum=arr[0];
        for (long i : arr) {
            if (i>maxNum)maxNum=i;

        }
        return maxNum;
    }
    public static short maxNum(short[]arr){
        short maxNum=arr[0];
        for (short i : arr) {
            if (i>maxNum)maxNum=i;

        }
        return maxNum;
    }
    public static float maxNum(float[]arr){
        float maxNum=arr[0];
        for (float i : arr) {
            if (i>maxNum)maxNum=i;

        }
        return maxNum;
    }
    public static byte maxNum(byte[]arr){
        byte maxNum=arr[0];
        for (byte i : arr) {
            if (i>maxNum)maxNum=i;

        }
        return maxNum;
    }
}
