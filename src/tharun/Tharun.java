package tharun;

import java.util.Scanner;

public class Tharun {
    public static void main(String[] args) {
        System.out.println("i am tharun peter");
        //type conversion and type casting
        Scanner input = new Scanner(System.in);

        int num = (int)(434.4f);
        System.out.println(num);

        //automatic type promotion in expressions
        int b = 127;
        byte biteValue = (byte)(b);
        System.out.println("biteValue :"+biteValue);

        char name = 't';
        short sho = 3343;
        long lo = 232434534;
        double oo = 324343353.34343434354353543434234243;
        float ff = 324.545454545534234343f;
        int nn = 10;
        int nn2 = 12;
        int nn3 = 15;
//        System.out.println("my " +(ff * oo));

        int maxvalue = Math.max(nn3,nn2);

        System.out.println(maxvalue);

//        do {
//            System.out.println(nn);
//            nn += 1;
//            System.out.println(nn);
//        }while(nn == 11);




    }
}
