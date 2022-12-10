package day10;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 1;
        String school;
        if (grade >= 1 && grade <= 18) {
            school = (grade >= 1 && grade <= 5) ? "Elementary school" :
                    (grade >= 6 && grade <= 8) ? "Middle school" :
                            (grade >= 9 && grade <= 12) ? "High school" :
                                    (grade >= 13 && grade <= 16) ? "College" : "Grad School";
        } else school = "Invalid grade level given";
        System.out.println(school);
    }}

