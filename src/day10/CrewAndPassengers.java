package day10;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int total=100, crew=30, passengers=70;
        String res;



        if(total==100){
            crew=30;
            passengers=70;
            res= crew+" crew members and "+passengers+" passengers";
        } else if (total==75) {
            crew=25;
            passengers=50;
            res= crew+" crew members and "+passengers+" passengers";
        }
        else if (total==50){
            crew=20;
            passengers=30;
            res= crew+" crew members and "+passengers+" passengers";
        }
        else res="invalid";

        System.out.println(res);

    }
}
