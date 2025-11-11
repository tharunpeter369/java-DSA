package sort;
import java.util.Arrays;
import java.util.List;
public class A5findTheAllMissingNumber {
    public static void main(String[] args) {
//        int[] sampleArr =  {4,3,2,7,8,2,3,1};//0 1 2
        int[] sampleArr = {1,1};
        int[] ans = cyclicSort(sampleArr);
//        System.out.println(ans+ "answer");
        System.out.println(Arrays.toString(ans)+"answer");
    }
    static int[] cyclicSort(int[] arr){
        int i =0;
        int count = 0;
        int lastChange=-1;
        while (i < arr.length) {
            System.out.println( "PPPPP"+i);
            //check for the correct
            if(arr[i] != i+1 && arr.length >= arr[i] && arr[i]!= arr[arr[i]-1] ){
                System.out.println( "answer"+arr[i]);
                int correctInd = arr[i]; //find correct index 2     4i
                int temp = arr[correctInd-1]; //value also 2    7v
                arr[correctInd-1] = arr[i]; // value 3 to index  arr[3] = 4
                arr[i] = temp; // values 2 to index 1    7
                System.out.println(Arrays.toString(arr)+"4444");
            }else{
                i++;
            }
        }
        // Find missing numbers
        int missingCount = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missingCount++;
            }
        }

        int[] missing = new int[missingCount];
        int placingIndex = 0;
        for(int j=0; j<arr.length; j++){
            if(j+1 != arr[j]){
                missing[placingIndex] = j+1;
                placingIndex = placingIndex + 1;
            }
        }
        return missing;
    }
}




//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> missing = cyclicSort(nums);
//        return missing;
//    }
//    static  List<Integer> cyclicSort(int[] arr){
//        int i =0;
//        int count = 0;
//        int lastChange=-1;
//        while (i < arr.length) {
//
//            int correctIndex = arr[i]-1;
//            if(arr[i]!= arr[correctIndex]){
//                int temp = arr[correctIndex]; //value also 2    7v
//                arr[correctIndex] = arr[i]; // value 3 to index  arr[3] = 4
//                arr[i] = temp; // values 2 to index 1    7
//            }else{
//                i++;
//            }
//
//        }
//        List<Integer> resList = new ArrayList<>();
//        // Loop and check condition
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != j + 1) {
//                resList.add(j + 1);
//            }
//        }
//        return resList;
//    }
//}


