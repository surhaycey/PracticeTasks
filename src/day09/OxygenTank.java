package day09;

public class OxygenTank {
    public static void main(String[] args) {
        int level=51;
        String res;

        if(level>=0&&level<=100)
        {
            if(level>=90)res="Your tank is full";
            else if (level>=80) res="Still okay";
            else if (level>=70) res="Don't go too far";
            else if (level>=60) res="Start to head back";
            else  res="Be careful now you at at 50%";

            }else res="invalid";

        System.out.println(res);
        }
    }

