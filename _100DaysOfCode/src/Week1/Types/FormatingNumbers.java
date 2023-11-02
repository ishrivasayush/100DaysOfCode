package Week1.Types;

import java.text.ChoiceFormat;
import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String res=currency.format(123456789.391);
        System.out.println(percent.format(0.1));
        System.out.println(res);
    }
}
