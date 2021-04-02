package Chepter_03;

public class Constants2 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {

        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " Ьу "
                + paperHeight * CM_PER_INCH);
        double x = 1;
        x += 3.5;
        System.out.println(x);
    }
}
