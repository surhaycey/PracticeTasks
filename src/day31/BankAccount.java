package day31;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){
    this.accountHolder=accountHolder;
    this.accountNumber=accountNumber;

    }

    public String toString() {
        return "BankAccount Account Holder='" + accountHolder+", Account Number=" + accountNumber +", balance=" + balance;

    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.err.println("Depositing amount can nı-ot be zero or negative");
            return;
        }
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("You can not withdraw zero or negative amount.");
            return;
        }
        if (amount>balance) {System.out.println("you can not withdraw more than your balance");
        return;}
        balance-=amount;

    }


}
