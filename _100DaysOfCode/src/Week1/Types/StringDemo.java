package Week1.Types;

import java.security.spec.RSAOtherPrimeInfo;

public class StringDemo {
    public static void main(String[] args) {
        String message=new String("Hello World");
        System.out.println(message.endsWith("d"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("W","*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        //WhiteSpace are removed
        System.out.println(message.trim());


    }
}
/*
Actual value = Arguement
Method signature= Parameters
 */
