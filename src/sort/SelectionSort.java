package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sampleArr = {-6, 5, -4, 3, 2, 1};
        int[] ans = selectionSort(sampleArr);
        System.out.println(Arrays.toString(ans) + "answer");
    }
    static int[] selectionSort(int[] arr){
//        [9,8,7,6,5,4]
        //run n-1 times
        for(int i=0; i<arr.length-1; i++ ){
            //find the max item in remaining array and swap with the correct index
            int last = arr.length-1-i;
            int maxIndex = 0;
            for(int j =1; j<=last; j++){
                //compare logic
                if(arr[maxIndex]< arr[j]){
                    maxIndex = j;
                }
            }
            //swap here
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
}
