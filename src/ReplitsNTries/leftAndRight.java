package ReplitsNTries;

public class leftAndRight {
    public static void main(String[] args) {
        int[] arr={4, 9,1, 3, 6, 4};


        for (int i = 0; i < arr.length; i++) {
            int left=0,right=0;
            for (int j = 0; j < i; j++) {
                left+=arr[j];
            }
            for (int k = arr.length-1; k >i; k--) {
                right+=arr[k];
            }

            if (right==left)System.out.println(i);


        }


    }
}
