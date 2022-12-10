package day08;

public class GradeLevel {
    public static void main(String[] args) {
        int grade=4;
        String school=(grade<=5 && grade>=1)? "Elementary school": (grade<=8 && grade>=6)? "Middle school" :
                (grade<=12 && grade>=9)? "High school" : (grade<=16 && grade>=13)? "College" :
                        (grade<=18 && grade>=17)? "Grad School" : "Not in school";



        System.out.println(school);
    }
}
