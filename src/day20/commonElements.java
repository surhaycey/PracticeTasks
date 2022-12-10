package day20;

public class commonElements {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,13,7},
        arr2[]={4,5,6,7,8,1,7,13},
                e1=arr1.length,
                e2=arr2.length;
        String res="";

        for (int i=0;i<e1;i++){
            int ar1=arr1[i];
            for (int i2=0;i2<e2;i2++){
                int ar2=arr2[i2];
                if (ar2==ar1&& !(res.contains(ar2+"")))res+=ar2+" ";

            }
        }

        System.out.println(res);
    }
}
