package ReplitsNTries;

import java.util.Arrays;

public class ZombieAttack {
    public static void main(String[] args) {
        int [] arr={3,6,0,4,3,2,7,0};
        int []temp=new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];


        }
        int a=0;
        do {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    if (arr[i] == 0) temp[i + 1] /= 0;
                } else if (i == arr.length - 1) {
                    if (arr[i] == 0) temp[arr.length - 2] /= 2;
                } else {
                    if (arr[i] == 0) temp[i + 1] /= 2;
                    temp[i - 1] /= 2;
                }
            }

            for (int z : temp) {
                a += z;


            }

            System.out.println(Arrays.toString(temp));
        }while (a!=0);



        }
    }

