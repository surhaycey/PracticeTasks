package day18;

public class unique {
    public static void main(String[] args) {

  String str="awqeqeewqe",
            res="",
            temp="";
    int count=0,count1=0;
        for(int a=0;a<=str.length()-1;a++){
                char aa=str.charAt(a);
                if (!temp.contains(aa+"")){count1++;
                temp+=aa+"";
                }

                }


                for (int i=0;i<count1;i++){
        char ch=str.charAt(0);
        count=0;

        while (str.contains(ch+"")){
        str=str.replaceFirst(ch+"","");
        count++;

        }

        if (count==1)res+=""+ch;





        }
        System.out.println(res);
        }
        }
