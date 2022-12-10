package day07;

public class SalaryTax {
    public static void main(String[] args) {
        double hourlyRate=50,
                weeklyHours=45,
                salaryBTax=hourlyRate*weeklyHours*52,
                stateTax=0.06*salaryBTax,
                federalTax=0.26*salaryBTax,
                totalTax=stateTax+federalTax,
                netIncome=salaryBTax-totalTax;

        System.out.println("Gross pay : $" + salaryBTax);
        System.out.println("Federal Tax : $" + federalTax);
        System.out.println("State Tax : $" + stateTax);
        System.out.println("Total Tax : $" + totalTax);
        System.out.println("Net Income : $" + netIncome);

    }
}
