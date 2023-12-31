package Projects.week1;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Principle: ");
        double principal=scanner.nextDouble();

        System.out.println("Annual Interest Rate: ");
        float annualInterest=scanner.nextFloat();
        Float monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years= scanner.nextByte();
        int numberOfPayments=years*MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
