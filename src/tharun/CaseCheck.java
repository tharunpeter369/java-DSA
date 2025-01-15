package tharun;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        char charval = in.next().trim().charAt(0);
        System.out.println("enter");
        char charval = in.next().charAt(0);

        if(charval>= 'a' && charval <= 'z'){
            System.out.println("lower case");
        }else{
            System.out.println("Upper case");
        }


        System.out.println(charval);

    }
}
