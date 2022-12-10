package day22;

public class reverseSecondWord {
    public static void main(String[] args) {
        String str="I love Java";
        String[] words=str.split(" ");
        String reverse="";
        for (int i=words[1].length()-1;i>=0;i--){
           reverse+= words[1].charAt(i);

        }
        System.out.println(reverse);
        str=str.replaceFirst(words[1],reverse);
        System.out.println("-----------------------------------------");
        words[1]=reverse;
        for (String word : words) {
            System.out.print(word+" ");
        }

    }
}
