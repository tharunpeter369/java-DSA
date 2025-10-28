package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sampleArr = {6,5,4,3,2,1};
        int[] ans=bubbleSort(sampleArr);
        System.out.println(Arrays.toString(ans)+"answer");

    }
    static int[] bubbleSort(int[] arr){
//        [9,8,7,6,5,4]
        //run n-1 times
        for(int i=0; i<arr.length-1; i++ ){
            boolean swap = false;
            for(int j =0; j<arr.length-i-1; j++){
                System.out.println(j+"jjjj");
                //compare logic
                if(arr[j]>arr[j+1]){
                    swap = true;
                    int temp = arr[j];
                     arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
            if(swap==false){
                break;
            }
        }
        return arr;
    }
}
