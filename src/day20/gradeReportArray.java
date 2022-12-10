package day20;

public class gradeReportArray {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];


        for (int i= names.length-1;i>=0;i--) {
            if(scores[i]>=90)grades[i]='A';
            else if (scores[i]>=80) grades[i]='B';
            else if (scores[i]>=70) grades[i]='C';

        }
        for (int i= names.length-1;i>=0;i--) {
            System.out.println(names[i]+"'s score is "+scores[i]+", and "+names[i]+"'s grade is "+grades[i]);

        }



    }
}
