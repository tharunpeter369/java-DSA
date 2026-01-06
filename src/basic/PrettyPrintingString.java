package basic;

import java.util.ArrayList;

public class PrettyPrintingString {
    public static void main(String[] args) {
        float a = 453.1245f;
        System.out.printf("Fomated number is %.2f",a);
        System.out.printf("Pie: %.3f",Math.PI);
        System.out.printf("Hello my name is %s and last name is %s","tharun","peter");
        System.out.println("ehllloooo"+ new ArrayList<>());
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
        System.out.println('a'+'b');

    }
}
