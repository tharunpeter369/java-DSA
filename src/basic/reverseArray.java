package basic;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr1 = {3,6,1,2,7,9,10};
//        System.out.println(arr1[arr1.length-1]);
        for(int i=0; i< arr1.length/2; i++){
            System.out.println(arr1[i]);
            arr1 = swap(arr1, i);
            System.out.println(Arrays.toString(arr1));
        }
    }

    static int[] swap(int[] arr,int b){
        int temp =  arr[b];
        arr[b] = arr[(arr.length-1) - b];
        arr[(arr.length-1) - b] = temp;
//        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
