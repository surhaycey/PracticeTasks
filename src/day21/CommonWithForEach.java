package day21;

public class CommonWithForEach {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={4,5,6,7,8};
        String res="";


        for (int i : arr1) {
            for (int i1 : arr2) {
                if(i==i1)res+=i+", ";

            }

        }
        res=res.substring(0,res.length()-2);
        System.out.println(res);
    }
}
