package search.BinarySearch;

public class CielingOfNumber {
    public static void main(String[] args) {
        int[] sample = { 1,3,4,5,6,7,8,9};
        int res = findCeilingFromArray(sample , 2);
        System.out.println(res);
    }
    static int findCeilingFromArray(int[] arr , int target){
        //find asc or desc
        int lengthOfGivenArray = arr.length;
        String dirOfSort = "asc";
        if(arr[0]>arr[lengthOfGivenArray-1]){
             dirOfSort = "dsc";
        }else{
            dirOfSort = "asc";
        }
        int flag = 1000;
        int start = 0;
        int end = lengthOfGivenArray -1;
        while(start <= end){
            int middle = start + (end-start)/2;
            if(arr[middle] >= target ){
                if(arr[middle]== target){
                    flag = arr[middle];
                    return flag;
                }else if(arr[middle] < flag){
                    flag = arr[middle];
                }
            }
            if(arr[middle] < target){
                start = middle + 1;
            }else if(arr[middle] > target){
                end = middle -1;
            }
        }

        System.out.println(dirOfSort);
        return flag;
    }
}
