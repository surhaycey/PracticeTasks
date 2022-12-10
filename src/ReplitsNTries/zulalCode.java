package ReplitsNTries;

public class zulalCode {
    public static void main(String[] args) {
        int[] arr = {5,5,1,5,4};

        int result = 0;
        for (int each : arr) {
            result += each;
        }

        int result1 = 0;
        for (int i = 0; i < arr.length; i++) {
            result1 += arr[i];
            if (result / 2 == result1) {
                System.out.println(i + 1);
                continue;
            }

        }
    }
}
