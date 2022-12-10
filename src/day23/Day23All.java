package day23;


import java.util.Arrays;

public class Day23All {
    public static void main(String[] args) {
        oddNums();
        System.out.println();
        evenNums();
        System.out.println();
        alcoholEligibility(25);
        System.out.println();
        voteInUSA(25,"usa");
        System.out.println();
        gradeReport(50);
        System.out.println();
        areaCircle(10);
        System.out.println();
        areaSquare(10);
        System.out.println();
        usdToEur(50);
        System.out.println();
        usdToTry(10);
        System.out.println();
        kgToLbs(10);
        System.out.println();
        intType(456);
        System.out.println();
        printEachChar("surhay");
        System.out.println();
        int[]arr={1,2,3,4,5};
        printEachElement(arr);
        System.out.println();
        anagram("surhay", "yahrus");
        System.out.println();
        calculator(1,2,'s');
        System.out.println();
        nameConv("CyDQwj SklSAJ");
    }
    public static void oddNums(){
        for (int i=1; i<=100;i++){
            if (i%2==1) System.out.print(i+" ");
        }
    }
    public static void evenNums(){
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0) System.out.print(i+ " ");
        }
    }
    public static void alcoholEligibility(int age){
        String res;
        if (age<120 && age>0){
            if (age>21) res="eligible";
            else res = "not eligible";


        }
        else res="invalid age";
        System.out.print(res);

    }
    public static void voteInUSA(int age, String country){
        String res;
        country=country.toLowerCase();
        if (country.equals("usa")){
        if (age>=18 && age<120) res="you can vote";
        else if (age<18&&age>=0)res="you can not vote cuz of age";
        else res="invalid age";
        }
        else if (!(age<120 && age>=0)) {
            res="invalid age";
        }
        else res="you can not vote";

        System.out.print(res);

        }

    public static void gradeReport(int grade){
        String res;
        if (grade>=0 && grade<=100){
            if (grade>=90)res="A";
            else if (grade>=80) res="B";
            else if (grade>=70)res="C";
            else if (grade>=60)res="D";
            else if (grade>=50)res="F";
            else res="failed";

        }
        else {res="invalid grade";}
            System.out.print(res);
    }

    public static void areaCircle(double radius){



        if (radius>0){
        System.out.print(3.141592*radius*radius);
    }
        else System.out.print("invalid");
}

    public static void areaSquare(double side){
        System.out.print(side*side);
    }

    public static void usdToEur(double usd){
        double eur=usd*1.01;
        System.out.print(eur);

    }

    public static void usdToTry(double usd){
        double trl=18.6*usd;
        System.out.print(trl);
    }

    public static void kgToLbs(double kg){
        double lbs=2.2*kg;
        System.out.print(lbs);
    }

    public static void intType(int integer){
        String res;
        if (integer>0)res="pos";
        else if (integer<0)res="neg";
        else res="zero";
        System.out.print(res);

    }

    public static void printEachChar(String str){
        String res="";
        char[] arr=str.toCharArray();
        for (char c : arr) {
            res+=c+", ";

        }
        res=res.substring(0,res.length()-2);
        System.out.print(res);
    }

    public static void printEachElement(int[] arr){
        String res="";
        for (int i : arr) {
            res+=i+" ,";
        }
        res=res.substring(0,res.length()-2);
        System.out.print(res);
    }

    public static void anagram(String str, String str1){
        char[]strArr=str.toCharArray();
        char[]str1Arr=str1.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(strArr);

        System.out.println(Arrays.toString(str1Arr));
        System.out.println(Arrays.toString(strArr));
        boolean a=Arrays.equals(str1Arr,strArr);
        if (a) System.out.print("anagram");
        else System.out.println();
    }

    public static void calculator(int num1, int num2,char operator){
        double res;
        boolean a=false;
         switch (operator){
             case '*':
                res= num1*num2;
                break;
             case '/':
                 res=num1*1.0/num2;
                 break;
             case '+':
                 res=num1+num2;
                 break;
             case '-':
                 res=num1-num2;
                 break;
             default:a=true;
             res=0;

         }
         if (a) System.out.print("invalid operator");
         else System.out.print(res);

    }

    public static void nameConv(String name){
        String fn,sn;
        fn=name.substring(0,name.indexOf(" "));
        sn=name.substring(name.indexOf(" ")+1);
        String fnfl=fn.charAt(0)+"",snfl=sn.charAt(0)+"";
        fn=fn.substring(1);
        sn=sn.substring(1);
        fn=fn.toLowerCase();
        sn=sn.toLowerCase();
        fnfl=fnfl.toUpperCase();
        snfl=snfl.toUpperCase();
        fn=fnfl+fn;
        sn=snfl+sn;
        name=fn+" "+sn;


        System.out.print(name);
    }



}
