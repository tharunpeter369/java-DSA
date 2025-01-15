package basic;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n1 = 8743298324566787893L;
        System.out.println("the number is : "+n1 );
        //find the counting occurance
        System.out.println("Enter the number nee to check the occurrence:");
        int val = in.nextInt();
        int count = 0;
        while(n1 !=0 ){
            float reminder = n1 % 10;
            if(reminder == val) {
                count++;
            }
            n1 = n1/10;
        }
//        System.out.println("the reminder is : "+reminder );
//        System.out.println(reminder == 3);
        System.out.println("the count is : "+count);

        int days = in.nextInt();
        String fruit = in.next();

        switch (days) {
            case 1 -> System.out.println("ddsd");
            case 2 -> System.out.println("jii");
            default -> System.out.println(days);
        }

        if(fruit.equals("Orange")){
            System.out.println("hello");
        }
    }
}
