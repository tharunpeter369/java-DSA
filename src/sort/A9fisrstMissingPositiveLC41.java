//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//        Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//Example 3:
//
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.


package sort;

import java.util.Arrays;

public class A9fisrstMissingPositiveLC41 {
    public static void main(String[] args) {
        int[] sample = {3,4,-1,1};
//        int[] sample ={7,8,9,11,12};
//        int[] sample = {1,2,0};
        int[] ans = cyclicSort(sample);
        int finalAns =  checkForMissingNumber(ans);
        System.out.println(Arrays.toString(ans)+"helloooo");
        System.out.println(finalAns+"finalAns");


    }
//    -1 4 3 1 ,
    static int[] cyclicSort(int[] arr){
        int i =0;
        while(i < arr.length ){
            System.out.println(Arrays.toString(arr)+"oiii"+i);
            System.out.println(arr[i]<arr.length);
            int correcteIndex = arr[i] - 1;
            if(arr[i]<arr.length && arr[i] > 0 && arr[i] != arr[correcteIndex] ){ // swap
                int temp = arr[i];
                arr[i]= arr[correcteIndex];
                arr[correcteIndex] =temp;
            }else{
                i++;
            }
        }
        return arr;
    }

    static int checkForMissingNumber(int[] data){
        for(int j = 0; j < data.length; j++){
            if(j+1 != data[j]){
                return j+1;
            }
        }
        return data[data.length-1]+1;
    }
}
