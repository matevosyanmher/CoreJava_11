package Chepter_03;

import java.util.Date;

public class InputTest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("What is your name ...");
//        String name = in.nextLine();
//
//        System.out.println("How old are you ...");
//        int age = Integer.parseInt(in.next());
//        System.out.println("My name is " + name + " and I'm " + age + " years old");
//
//        double s = 5.0;
//        int x = 7;
//        float d = 7.23f;
//        // System.out.println(Integer.parseInt(s) * x);
//
//        int a = (int) (s * x * d);

//        System.out.printf("Hello, %s. Next year, you'll be %f", name, age);
        System.out.printf("%,(.2f", 100000000.0 / 3.0);
        System.out.println();
        System.out.printf("%tc", new Date(), "\n");
        System.out.println();
        System.out.printf("%s %tb %<te %<tY", "Due date: ", new Date());
    }


}
