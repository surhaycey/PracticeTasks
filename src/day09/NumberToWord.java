package day09;

public class NumberToWord {
    public static void main(String[] args) {
        int num=1;
        String res;

        if(num<=9 && num>=0){
            res = (num==0)?"zero":(num==1)? "one" :
                    (num==2)?"two":(num==3)?"three":
                            (num==4)?"four":(num==5)?"five":
                                    (num==6)?"six":(num==7)?"seven":(num==8)?"eight":"nine";
        }else res="invalid";
        System.out.println(res);


    }
}
