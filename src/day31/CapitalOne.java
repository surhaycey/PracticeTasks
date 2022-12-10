package day31;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        acc1.setInfo("surhay ceylan" ,123465);

        System.out.println(acc1);
        acc1.deposit(1000);
        acc1.checkBalance();
        acc1.withdraw(1200);
        acc1.withdraw(900);
        acc1.checkBalance();

    }
}
