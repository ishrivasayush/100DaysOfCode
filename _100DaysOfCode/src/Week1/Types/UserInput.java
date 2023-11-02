package Week1.Types;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("You are "+age);
    }
}
