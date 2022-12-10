package day19;


public class frequentChar {
    public static void main(String[] args) {
        String str="qweeeeeeee",

                temp="",maxch="";
        int count,count1=0,maxCount=0;
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


            if (count>maxCount){maxCount=count;
                maxch=ch+"";}





        }

        System.out.println("'"+maxch+"'"+" is used "+maxCount+" times.");
    }
}
