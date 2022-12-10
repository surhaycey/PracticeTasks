package day09;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNum=6;
        String res;
        if (gradeNum>=1&&gradeNum<=6){
            if(gradeNum==1){
            res=" location -  Apple orchard\n" +
                    "number of groups - 3\n" +
                    "teacher in charge - Ms. Smith";}
            else if (gradeNum==2) {
                res="location - Zoo\n" +
                        "number of groups - 7\n" +
                        "teacher in charge - Mr. Lee";}
            else if (gradeNum==3) {res="location - Aquarium\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Wilson\n";}
            else if (gradeNum==4) {
                res="location - Movie theater  \n" +
                        "number of groups - 2\n" +
                        "teacher in charge - Ms. Reyes";


            }
            else if (gradeNum==5) {
                res="location - Museum \n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela ";


            }
            else {
                res="location - Six Flags\n" +
                        "number of groups - 8\n" +
                        "teacher in charge - Mr. Watt";

            }

        }else res="invalid";

        System.out.println(res);
    }
}
