package basic;

import java.util.Scanner;

public class Fibnocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //find the n the fibnocci number

        System.out.println("Enter the n th value: ");
        int nthVal = in.nextInt();
        int count = 1 ;

//        System.out.println(nthVal);
        int prevVal = 0;
        int fibVal = 1;
        while (nthVal != count && nthVal > 0) {
            int temp = fibVal;
            fibVal = prevVal + fibVal;
            prevVal = temp;
            count = count + 1;
            System.out.println( count +"the");
        }

        System.out.println("the fibnocci value: " + fibVal);
        }
    }

