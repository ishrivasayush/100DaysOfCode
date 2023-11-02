package Week1.Types;

public class Casting {
    public static void main(String[] args) {
        //Implicit casting -> No Data lose
        // byte > short > int > long > float > double

        String z="1";
        short x=1;
        int y=Integer.parseInt(z)+2;
        System.out.println(y);
    }
}
