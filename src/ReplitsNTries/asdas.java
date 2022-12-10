package ReplitsNTries;

import java.util.ArrayList;
import java.util.Arrays;

public class asdas {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
     list.add(4);
        System.out.println(list);

        int a=list.size();


        ArrayList<Integer>temp=list;
        for (int i = 0; i < list.size(); i++) {

            if (i==list.size()-1){ if (list.get(i)%2==1){
                temp.add(list.get(i)*2);

                temp.remove(i);
                }}
            else {
            if (list.get(i)%2==1){

                temp.add(i+1,list.get(i)*2);
                temp.remove(i);
            }}



        }
        System.out.println(list);








    }}