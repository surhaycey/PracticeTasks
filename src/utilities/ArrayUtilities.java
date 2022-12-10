package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilities {
    public static void main(String[] args) {
        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList( 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        System.out.println(countGrades(scores));










    }
            public static int[] insertLast(int[]arr, int num){
        int[]temp=new int[arr.length+1];
    System.arraycopy(arr, 0, temp, 0, arr.length);
    temp[arr.length]=num;

    arr=temp;
    return arr;






}
            public static float[] insertLast(float[]arr, float num){
        float[]temp=new float[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }
            public static double[] insertLast(double[]arr, double num){
        double[]temp=new double[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }
            public static String[] insertLast(String[]arr, String num){
        String[]temp=new String[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }
            public static short[] insertLast(short[]arr, short num){
        short[]temp=new short[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }
            public static long[] insertLast(long[]arr, long num){
        long[]temp=new long[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }
            public static char[] insertLast(char[]arr, char num){
        char[]temp=new char[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }
            public static boolean[] insertLast(boolean[]arr, boolean num){
        boolean[]temp=new boolean[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[arr.length]=num;

        arr=temp;
        return arr;






    }

//DAY 27------------------------------------------------------------------------------------------
                public static int[] Insert(int[]arr, int index,int element){
        int []temp=new int[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static boolean[] Insert(boolean[]arr, int index,boolean element){
        boolean []temp=new boolean[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static String[] Insert(String[]arr, int index,String element){
        String []temp=new String[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static double[] Insert(double[]arr, int index,double element){
        double []temp=new double[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static byte[] Insert(byte[]arr, int index,byte element){
        byte []temp=new byte[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static short[] Insert(short[]arr, int index,short element){
        short []temp=new short[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static long[] Insert(long[]arr, int index,long element){
        long []temp=new long[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static float[] Insert(float[]arr, int index,float element){
        float []temp=new float[arr.length+1];
        for (int i = 0; i < temp.length; i++) {
            if (i<index){temp[i]=arr[i];
            } else if (i==index) {temp[i]=element;

            } else {temp[i]=arr[i-1];
            }
        }
        return temp;







    }
                public static int[] Swap(int[]arr,int swap1, int swap2){
                    int[]temp=new int[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static boolean[] Swap(boolean[]arr,int swap1, int swap2){
                    boolean[]temp=new boolean[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static String[] Swap(String[]arr,int swap1, int swap2){
                    String[]temp=new String[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static double[] Swap(double[]arr,int swap1, int swap2){
                    double[]temp=new double[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static long[] Swap(long[]arr,int swap1, int swap2){
                    long[]temp=new long[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static short[] Swap(short[]arr,int swap1, int swap2){
                    short[]temp=new short[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static float[] Swap(float[]arr,int swap1, int swap2){
                    float[]temp=new float[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static byte[] Swap(byte[]arr,int swap1, int swap2){
                    byte[]temp=new byte[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (i==swap1){temp[i]=arr[swap2];}
                        else if (i==swap2){temp[i]=arr[swap1];}
                        else temp[i]=arr[i];
                    }
                    return temp;


                }
                public static String retrieve(String str){
                    char []eachChar=str.toCharArray();

                    String letters="", digs="",special="";

                    for (char c : eachChar) {
                        if ((c<='Z'&& c>='A')||(c<='z'&& c>='a'))letters+=c;
                        else if ((c<='9'&& c>='0'))digs+=c;
                        else special+=c;

                    }
                    String res= "letters : \""+letters+"\"\ndigs : \""+digs+"\"\nspecials : \""+special+"\"";

                    return res;
                }
                public static boolean equalUpperAndLower(String str){
                    char[]each=str.toCharArray();
                    int up=0,low=0;
                    for (char c : each) {
                        if (c<='Z'&&c>='A')up++;
                        else if (c<='z'&&c>='a')low++;



                }
                    return (low==up);



            }
               //-----------------------------------
              //-----------------------------------
             //DAY 28--------------------------------------------------------------------------------


                public static ArrayList<Integer> turnLastToZero(ArrayList<Integer> list){
                    list.remove(list.size()-1);
                    list.add(0);
                    return list;
            }
                public static ArrayList<Integer> swap(ArrayList<Integer> list){
                    Integer a=list.get(0);
                    Integer b=list.get(list.size()-1);
                    list.remove(0);
                    list.add(0,b);
                    list.remove(list.size()-1);

                    list.add(a);
                return list;
                }

                public static ArrayList<Integer>doubleIfOdd(ArrayList<Integer>list){

                    ArrayList<Integer>temp=list;
                    for (int i = 0; i < list.size(); i++) {

                        if (i==list.size()-1){ if (list.get(i)%2==1){
                            temp.add(list.get(i)*2);

                            temp.remove(i);
                        }}
                        else {
                            if (list.get(i)%2==1){

                                temp.add(i+1,list.get(i)*2);
                                temp.remove(i);
                            }}



                    }

                    return list;




                }

                public static ArrayList<String> combineArrays(String[]arr1,String[]arr2){

                    ArrayList<String> list=new ArrayList<>();
                    for (String s : arr1) {
                        list.add(s);

                    }
                    for (String s : arr2) {
                        list.add(s);

                    }

                    return list;



                }

                public static int maxNum(ArrayList<Integer> list){
                int max=list.get(0);
                    for (Integer integer : list) {
                        if (integer>max)max=integer;
                    }
                    return max;
                }
                public static int minNum(ArrayList<Integer> list){
        int min=list.get(0);
        for (Integer integer : list) {
            if (integer<min)min=integer;
        }
        return min;
    }
                public static int duplicatedElement(ArrayList<Integer> list){
        int element;
                    for (int i = 0; i < list.size(); i++) {
                       if (i<list.size()-2){ if (list.get(i)==list.get(i+1))return list.get(i);}

                    }
                    return 0;
        }

                public static String countGrades(ArrayList<Integer>grades){

                    ArrayList<Integer> gradeOfA = new ArrayList<>();
                    ArrayList<Integer> gradeOfB = new ArrayList<>();
                    ArrayList<Integer> gradeOfC = new ArrayList<>();
                    ArrayList<Integer> gradeOfD = new ArrayList<>();
                    ArrayList<Integer> gradeOfF = new ArrayList<>();

                    for (Integer grade : grades) {
                        if (grade>=90) gradeOfA.add(grade);
                        else if (grade>=80)gradeOfB.add(grade);
                        else if (grade>=70)gradeOfC.add(grade);
                        else if (grade>=60)gradeOfD.add(grade);
                                        else gradeOfF.add(grade);
                    }

                    String res="A count : "+gradeOfA.size()+"\nB count : "+gradeOfB.size()+"\nC count : "+gradeOfC.size()+"\nD count : "+gradeOfD.size()+"\nF count : "+gradeOfF.size();


return res;



                }

                //-----------------------------------


    }












