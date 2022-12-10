package day21;

public class ArrayPalindrome {
    public static void main(String[] args) {
        String []arr={"anna", "level", "Java"};
        int count=0;

        for (String s : arr) {
            String temp="";
            int length=s.length();
            for (int i=length-1;i>=0;i--){
                temp+=s.charAt(i);


            }
            if (temp.equals(s))count++;

        }
        System.out.println(count);
    }
}
