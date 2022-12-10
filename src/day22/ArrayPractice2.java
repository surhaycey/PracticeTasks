package day22;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
        String [][] batch25Groups=new String[3][];
        batch25Groups[0]=batch25Group1;
        batch25Groups[1]=batch25Group2;
        batch25Groups[2]=batch25Group3;

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        String [][] batch24Groups=new String[3][];
        batch24Groups[0]=batch24Group1;
        batch24Groups[1]=batch24Group2;
        batch24Groups[2]=batch24Group3;

        int count=0;
        for (String[] batch24Group : batch24Groups) {
            count+=batch24Group.length;

            }
        for (String[] batch25Group : batch25Groups) {
            count+=batch25Group.length;
        }
        String[] CydeoStudents=new String[count];
        count=0;
        for (String[] batch24Group : batch24Groups) {
            for (String s : batch24Group) {
                CydeoStudents[count]=s;
                count++;
            }
        }
        for (String[] batch25Group : batch25Groups) {
            for (String s : batch25Group) {
                CydeoStudents[count]=s;
                count++;

            }
        }


        System.out.println(Arrays.toString(CydeoStudents));



    }
}
