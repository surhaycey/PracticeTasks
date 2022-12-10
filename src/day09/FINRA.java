package day09;

public class FINRA {
    public static void main(String[] args) {
        int num=3;

        boolean d3= num%3==0;
        boolean d5= num%5==0;

        if(d3){

            if(d5) System.out.println("FINRA");
            else System.out.println("FIN");}
        else if(d5) System.out.println("RA");
        else System.out.println(num);


    }
}
