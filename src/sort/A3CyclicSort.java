package sort;

import java.util.Arrays;

public class A3CyclicSort {
    public static void main(String[] args) {
//        int[] sampleArr = {3,5,2,1,4};
        int[] sampleArr = {4,2,3,1};
        int[] ans = cyclicSort(sampleArr);
        System.out.println(Arrays.toString(ans) + "answer");
    }
    static int[] cyclicSort(int[] arr){
        int i =0;
        while (i < arr.length) {
            //check for the correct
            if(arr[i] != i+1){
                int correctInd = arr[i]-1; //find correct index 2
                int temp = arr[correctInd]; //value also 2
                arr[correctInd] = arr[i]; // value 3 to index 2
                arr[i] = temp; // values 2 to index 1
            }else{
                i++;
            }
        }
        return arr;
    }
}



//            while(arr[i]-1 != i){
//                    int temp = arr[arr[i]-1];
//                    arr[arr[i]-1] = arr[i];
//                    arr[i] = temp;
//                System.out.println(Arrays.toString(arr) + "answer");
//
//            }

//package sort;
//
//import java.util.Arrays;
//
//public class A3CyclicSort {
//    public static void main(String[] args) {
//        int[] sampleArr = {3,5,2,1,4};
//        int[] ans = cyclicSort(sampleArr);
//        // System.out.println(Arrays.toString(ans) + " answer");
//    }
//
//    static int[] cyclicSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            while(arr[i] - 1 != i){
//                int temp = arr[arr[i]-1];        // Step 1: Read value at target
//                arr[arr[i]-1] = arr[i];          // Step 2: Put current value to target
//                arr[i] = temp;                   // Step 3: Put saved value here
//                System.out.println(Arrays.toString(arr) + " answer");
//            }
//        }
//        return arr;
//    }
//}


