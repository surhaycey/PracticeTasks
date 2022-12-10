package day10;

public class Grade {
    public static void main(String[] args) {
        char grade='A';
        String res;
        if (grade=='A') res="Excellent";
        else if (grade=='B') res="Great Job";
        else if (grade=='C') res="Good";
        else if (grade=='D') res="Passed";
        else if (grade=='F') res="Failed";
        else res="invalid";

        System.out.println(res);

    }
}
