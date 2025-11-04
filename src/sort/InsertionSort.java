package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sampleArr = {-6, 5, -4, 3, 2, 1};
        int[] ans = insertionSort(sampleArr);
        System.out.println(Arrays.toString(ans) + "answer");
    }
    static int[] insertionSort(int[] arr){
//        [9,8,7,6,5,4]
        //run n-1 times
        for(int i=0; i<arr.length-1; i++ ){
            for(int j = i+1; j > 0; j--){
                        if(arr[j]<arr[j-1]){
                            //then swap
                            int temp = arr[j];
                            arr[j]=arr[j-1];
                            arr[j-1] = temp;
                        }else{
                            break;
                        }
            }
        }
        return arr;
    }
}
