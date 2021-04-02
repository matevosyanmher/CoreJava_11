package Chepter_03;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class ClassString {
    public static void main(String[] args) {
        String s = "Hello";
        String a = "Hello".repeat(3);
        System.out.println(s.substring(0, 3) + "p");
        String x = s.substring(0, 4) + "o";
        String all = String.join(" / ", "S", "М", "L", "XL");
        System.out.println(all);

        if (s == x) {
            System.out.println(true);
        } else System.out.println(false);

        if (s.equals(x) ) {
            System.out.println(true);
        } else System.out.println(false);

//        Console console = System.console();
//        String username = console.readLine("Username: ");
//        char[] password = console.readPassword("Password: ");
    }
}
