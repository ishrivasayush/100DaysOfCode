package Week1.FlowControl;

import java.util.Locale;
import java.util.Scanner;

public class WhileStatement {
    public static void main(String[] args) {
        String input="";
        Scanner scanner=new Scanner(System.in);
        while (!input.equals("quit"))
        {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

    }
}
