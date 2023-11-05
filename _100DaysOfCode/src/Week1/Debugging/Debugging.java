package Week1.Debugging;

public class Debugging {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumbers(4);
        System.out.println("End");

    }
    public static void printNumbers(int limit)
    {
        for (int i = 0; i <limit ; i++) {
            System.out.println(i);
        }
    }

}
