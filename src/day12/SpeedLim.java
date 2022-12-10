package day12;
import java.util.Scanner;
public class SpeedLim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit, current,diff;

        String res;
        System.out.println("What is the speed limit on the road you are driving?");
        limit= sc.nextInt();
        System.out.println("What is your current speed?");
        current=sc.nextInt();

        if (current>limit){
            diff=current-limit;
            res="You are "+diff+" mph over the limit, slow down.";

        } else res="";
        System.out.println(res);



    }
}
