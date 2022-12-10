package day09;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection=5;
        String res;

        if(selection>=1 && selection<=5){
            res= (selection==1)? "Hello, thank for your call":(selection==2)? "Hola, gracias para llamar":
                    (selection==3)?"Merhaba, aradiginiz icin tesekkurler": (selection==4)?"Privet, spasibo za vash zvonok": "Merci ,pour votre appel";
        } else res="invalid";
        System.out.println(res);

    }
}
