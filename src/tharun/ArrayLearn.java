package tharun;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLearn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[5];
//        System.out.println("hello world");
////        arr = {2,45,5};
//        System.out.println(arr[0]);
//
//        String[] stdr = new String[5];
//        System.out.println(stdr[0]);

        for (int i =0; i <= 4 ; i ++){
            System.out.println("Enter the Numbers "+ i);
            arr[i] = inp.nextInt();
        }

//        for (int i =0; i <= 4 ; i ++){
//            System.out.println("The Numbers "+ arr[i]);
//        }

        System.out.println(Arrays.toString(arr));

//        for (int num : arr ){
//            System.out.println("The Numbers "+ num);
//        }
//int[] arr1 = {4,56,6};
//        System.out.println(arr1[1]);

//        int[] arr2 = new int[3];

//        arr1.cont



    }
}
