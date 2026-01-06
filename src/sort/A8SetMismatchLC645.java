
//https://leetcode.com/problems/set-mismatch/description/
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
// due to some error,one of the numbers in s got duplicated to another number in the set, which results
// in repetition of one number and loss of another number.
//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//        Example 1:
//Input: nums = [1,2,2,4]
//Output: [2,3]
//Example 2:
//
//Input: nums = [1,1]
//Output: [1,2]
package sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A8SetMismatchLC645 {
    public static void main(String[] args) {
        int[] sampleArr = {4,2,2,1};
        int[] ans = cyclicSort(sampleArr);
        int[] duplicateAndMissing= findDupAndMis(ans);
        System.out.println(Arrays.toString(duplicateAndMissing)+"helloooo");
    }
    static int[] cyclicSort(int[] arr){
        int i =0;
//        System.out.println();
        while(arr.length > i){
            int correctedIndex = arr[i] - 1;
            if(arr[i] != arr[correctedIndex]){
                int temp = arr[correctedIndex];
                arr[correctedIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
     return arr;
    };

    static  int[] findDupAndMis(int[] dataArr){
        int[] missing = new int[2];
        for(int j=0; j< dataArr.length; j++){
            if(j+1 != dataArr[j]){
                missing[0] = dataArr[j];
                missing[1] = j+1;
            }
        }
        return missing;
    };
}
