package sort;

import java.util.Arrays;

public class A4FindiMissingNmber {
    public static void main(String[] args) {
        int[] sampleArr =  {3,0,1};//0 1 2
//        int[] sampleArr = {3,5,2,1,0,4};
        int ans = cyclicSort(sampleArr);
        System.out.println(ans+ "answer");
    }
    static int cyclicSort(int[] arr){
        int i =0;
        while (i < arr.length) {
            System.out.println( "answer"+i);
            //check for the correct
            if(arr[i] != i && arr.length > arr[i]){
                int correctInd = arr[i]; //find correct index 2
                int temp = arr[correctInd]; //value also 2
                arr[correctInd] = arr[i]; // value 3 to index 2
                arr[i] = temp; // values 2 to index 1
            }else{
                i++;
            }
        }
        //find missing numer
        for(int j=0; j<arr.length; j++){
            if(j != arr[j]){
                return j;
            }
        }
        return arr.length;
    }
}


//package sort;
//
//import java.util.Arrays;
//
//public class A4FindiMissingNmber {
//    public static void main(String[] args) {
////        int[] sampleArr = {3,5,2,1,4};
//        int[] sampleArr = {3,0,1};//0 1 2
////        301 031 013
////        int[] sampleArr = {2,0,3}; // 0 1
////        302 032
////        int[] sampleArr = {0,1}; // 0 1
//
//
//        int[] ans = cyclicSort(sampleArr);
//        // System.out.println(Arrays.toString(ans) + " answer");
//    }
//
//    static int[] cyclicSort(int[] arr){
//        int outof = -1;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("l"+i);
//            while(arr[i]  != i){
//                if(arr.length > arr[i]) {
//                    int temp = arr[arr[i]];        // Step 1: Read value at target
//                    arr[arr[i]] = arr[i];          // Step 2: Put current value to target
//                    arr[i] = temp;                   // Step 3: Put saved value here
//                    System.out.println(Arrays.toString(arr) + " answer" + i);
//                }else{
//                    outof = i;
//                    break;
//                }
//            }
//
//        }
//        System.out.println(outof+ "value");
//        return arr;
//    }
//}
