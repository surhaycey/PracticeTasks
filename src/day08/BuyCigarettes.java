package day08;

public class BuyCigarettes {
    public static void main(String[] args) {
        byte age=22;
        String canBuyCigarette=(age>=18)? "can" :"can't";

        System.out.println("The person "+canBuyCigarette+" buy cigarettes.");
    }
}
