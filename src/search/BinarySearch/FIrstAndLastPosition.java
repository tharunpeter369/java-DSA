package search.BinarySearch;
import java.util.Arrays; // Add this import for Arrays.toString()
public class FIrstAndLastPosition {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = {-1,-1};
        int firstIndexAns = binarySearchStartOrEnd(arr,target,true);
        ans[0] =firstIndexAns;
        if(firstIndexAns != -1) {
            int lastIndexAns = binarySearchStartOrEnd(arr, target, false);
            ans[1] =lastIndexAns;
        }


        System.out.println(ans);
//        return ans;
    }
    static int binarySearchStartOrEnd(int[] arrData, int target, boolean findStartIndex){
        int start = 0;
        int end = arrData.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arrData[mid] > target){
                end = mid - 1;
            }else if(arrData[mid] < target){
                start = mid + 1;
            }else
            {
                // potential answer is mid
                ans = mid;
                if(findStartIndex){
                    //go to left
                    end = mid - 1;
                }else{
                    start = mid + 1;
                    //go to right
                }
            }
        }
        return ans;
    }
};