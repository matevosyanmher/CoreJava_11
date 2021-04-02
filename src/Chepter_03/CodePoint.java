package Chepter_03;

public class CodePoint {

    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.length());
        int codePoints = greeting.codePointCount(0, greeting.length());
        System.out.println(codePoints);

        String sentence = "O is the set of octonions";
        char ch = sentence.charAt(2);
        System.out.println(ch);

        int[] codePointCount = sentence.codePoints().toArray();
        for (int i = 0; i < codePointCount.length; i++) {
            System.out.print(codePointCount[i] + " ");
        }
        System.out.println(sentence.codePointAt(2));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('a');
        stringBuilder.append("sasas");
        stringBuilder.reverse();
        stringBuilder.replace(0, stringBuilder.length()-3, "sdddddddddddddd");
        System.out.println(stringBuilder.toString());
    }


}
