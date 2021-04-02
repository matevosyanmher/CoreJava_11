package Chepter_03;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {

        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
//        for (int element : a) {
//            System.out.println(element);
//        }
        int[] copyOfa = Arrays.copyOf(a, a.length-20);
        System.out.println(Arrays.toString(copyOfa));

        int[] copyOfa2 = Arrays.copyOf(a, a.length+15);
        System.out.println(Arrays.toString(copyOfa2));
    }
}
