package Week1.CleanCode;

public class CreatingMethods {
    public static void main(String[] args) {
        System.out.println(greetUser("Ayush","Shrivastava"));

    }
    public static String greetUser(String firstName,String lastName)
    {
        return "Hello "+firstName+" "+lastName;
    }
}
