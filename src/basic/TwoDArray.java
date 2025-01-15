package basic;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][] arr = {
                {11,22,3},
                {3},
                {99,65,4,2,6}
        };

//        System.out.println(Arrays.toString(arr[2]));
        System.out.println(arr[0][2]);

//        create a 2d array
        int[][] arr3 = new int[3][4];

        for(int i=0; i < arr3.length;  i++){
            for(int j=0; j < arr3[i].length; j++){
                System.out.println("Enter the 2d array numbers");
                arr3[i][j] = in.nextInt();
            }
        }

        for(int i=0; i < arr3.length;  i++){
            for(int j=0; j < arr3[i].length; j++){
                System.out.println(arr3[i][j]);
            }
        }

    }
}

