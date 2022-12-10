package day24;

import java.util.Arrays;

public class day24All {
    public static void main(String[] args) {
       int frequency= frequencyOfWord("Java java java python python","java");
        System.out.println(frequency);

        boolean a=anagram("abc","acb");
        System.out.println(a);

        String reverse=reverse("java");
        System.out.println(reverse);

        boolean b=isPalindrome("ava");
        System.out.println(b);

        int[] arr={1,2,3,1,1,1,1,3};
        int freq=frequencyInArray(arr,3);
        System.out.println(freq);

        int[] addedElem={1,2,3,45,45,45};
        addedElem=addElement(addedElem,4);
        System.out.println(Arrays.toString(addedElem));

        int[]merge={1,2,3};
        int[]merge1={4,5,6};
        int[]merged=mergeArrays(merge,merge1);
        System.out.println(Arrays.toString(merged));

        int[] reversing={1,2,3};
        int[]reversed=reverseArr(reversing);
        System.out.println(Arrays.toString(reversed));

        boolean c=containsInArr(merged,10);
        System.out.println(c);

        int[]removed= removeElement(new int[]{1, 2, 3, 1, 5},4);
        System.out.println(Arrays.toString(removed));








    }
    public static int frequencyOfWord(String sentence, String word){
        sentence=sentence.toLowerCase();
        int count=0;
        word=word.toLowerCase();
        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;

        }
        return count;

    }
    public static boolean anagram(String s1,String s2){
        char [] s1arr=s1.toCharArray();
        char [] s2arr=s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        return (Arrays.equals(s1arr,s2arr));
    }

    public static String reverse(String str){
        String reverse="";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String str){
        String reverse="";
        str=str.toLowerCase();

        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return (str.equals(reverse));
    }

    public static int frequencyInArray(int[] arr,int num){
        int count=0;
        for (int i : arr) {
            if (i==num)count++;

            
        }
        return count;
    }

    public static int[] addElement(int []arr, int num){
        int[] temp=new int[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i== temp.length-1)temp[i]=num;
            else temp[i]=arr[i];

        }
        return temp;
    }

    public static int[] mergeArrays(int[] arr, int[]arr1){
        int[] res=new int[arr.length+arr1.length];
        int index=0;
        for (int i : arr) {
            res[index]=i;
            index++;

        }
        for (int i : arr1) {
            res[index]=i;
index++;

        }
        return res;

    }

    public static int[] reverseArr(int[]arr){
        int[] res=new int[arr.length];

        for (int i = 0,a=arr.length-1; i < arr.length; i++ ,a--) {
            res[i]=arr[a];

        }
        return res;
    }

    public static boolean containsInArr(int[]arr,int num){
        boolean a=false;

        for (int i : arr) {
            if(i==num){ a=true;
                break;



        }




    }
        return a;

}

    public static int[] removeElement(int[]arr,int indexNum) {
        int[] res = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (i < indexNum) {
                res[i] = arr[i];
            } else if (i >= indexNum) {
                res[i] = arr[i +1];


            }


        }
        return res;
    }


}
