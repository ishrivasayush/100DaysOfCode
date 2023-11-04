package Week1.FlowControl;

import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {
        String input="";
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        while (!input.equals("quit"));
    }
}
