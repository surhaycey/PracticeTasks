package day19;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        String cnt = "";
        do {
            char grade;
            System.out.println("Enter your score");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("invalid entry");
                System.exit(404);

            }
            if (score >= 90) grade = 'A';
            else if (score >= 80) grade = 'B';
            else if (score >= 70) grade = 'C';
            else if (score >= 60) grade = 'D';
            else grade = 'F';

            System.out.println(grade);

            System.out.println("continue?");
            cnt = sc.next();
            cnt = cnt.toLowerCase();
            if (cnt.equals("no")) System.out.println("Thank you for using Cydeo Grade Calculator APP");
            else if (!(cnt.equals("yes"))) {
                System.out.println("invalid entry");
                System.exit(1);

            }


        } while (cnt.equals("yes"));
    }
}
