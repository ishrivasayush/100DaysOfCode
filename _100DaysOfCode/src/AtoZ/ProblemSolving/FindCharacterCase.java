package AtoZ.ProblemSolving;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.print(Character.isAlphabetic(c)?(Character.isUpperCase(c)?1:0):-1);
    }
}
