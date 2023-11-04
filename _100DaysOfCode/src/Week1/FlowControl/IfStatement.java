package Week1.FlowControl;

public class IfStatement {
    public static void main(String[] args) {
        int temp =32;
        if (temp>30)
        {
            System.out.println("drink plenty of water");
        }
        else if(temp>20 && temp<30)
        {
            System.out.println("It is a nice day");
        }
        else {
            System.out.println("Its cold");
        }
    }
}
