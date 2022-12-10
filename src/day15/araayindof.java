package day15;

import java.util.Arrays;
import java.util.Scanner;

public class araayindof {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {25, 10, 24, 0, 15, 20, 10, 4};//{input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        System.out.println("Day 0 "+Arrays.toString(inhabitants));
        boolean a=(inhabitants[1]==0 && inhabitants[2]==0 && inhabitants[3]==0 && inhabitants[4]==0 && inhabitants[0]==0);
        int day=1;
        while(!a){

            for (int i=0;i<=7;i++){
                if (i==0){
                    if (inhabitants[1] == 0) inhabitants[0]/=2;
                }
                else if(i==7){
                    if (inhabitants[6] == 0){
                        inhabitants[7]/=2;
                    }}
                else {if ((inhabitants[i+1] == 0 ||inhabitants[i-1] == 0)&&inhabitants[i]!=0){
                    inhabitants[i]/=2;


                }
                }
                }
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

            day++;
            a=(inhabitants[1]==0 && inhabitants[2]==0
                    && inhabitants[3]==0 && inhabitants[4]==0
                     && inhabitants[5]==0 && inhabitants[6]==0
                      && inhabitants[7]==0)&& inhabitants[0]==0;


        }

        System.out.println("---- EXTINCT ----");}}
