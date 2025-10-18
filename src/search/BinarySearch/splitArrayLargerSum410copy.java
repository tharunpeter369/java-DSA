package search.BinarySearch;

public class splitArrayLargerSum410copy {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k =2;
        int ans = splitArray(nums,k);
        System.out.println(ans+"hello world");
    }
    // Split array into k non-empty CONTIGUOUS parts
    // so that the LARGEST part sum is as small as possible.
    // We binary-search that answer and use a greedy check.
    static int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int x: nums){
            if(x>low){
                low=x;
            }
            high = high + x;
        }
        //ans= smallest value in [largest list of possible subarray]
        //we are searching for ans thats lies between low and high
        System.out.println(low+"dd"+high);
        while(high > low){
            int mid = low + (high- low)/2;
            boolean split = canSplit(nums,k,mid);
            if(split){
                high = mid;
            }else{
                low = mid + 1;
            }

        }
        return low;
    }

    static boolean canSplit(int[] nums,int k,int mid){

        int numberOfSubArray = 1;
        int sum = 0;
//        int[] nums = {7,2,5,10,8};
        for(int loopEl:nums){
            if(mid >= sum + loopEl){
                sum = sum + loopEl;
            }else{
                sum=loopEl;
                numberOfSubArray = numberOfSubArray + 1;
                if(numberOfSubArray > k ){
                    return false;
                }
            }
        }
        return true;
//        if(k >= numberOfSubArray){
//            return true;
//        }else{
//            return false;
//        }
    }
}
