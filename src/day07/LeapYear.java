package day07;

public class LeapYear {
    public static void main(String[] args) {

        int year=2020;
        boolean result=(year %4==0)? true:false;
        System.out.println(year+" is leap year: "+result);
    }
}
