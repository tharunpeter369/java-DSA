package search.BinarySearch;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] sampleArray = {0,2,3,4,3,2,1};
        int res = mountainValue(sampleArray);
        System.out.println(res);
    }

    static int mountainValue(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
             int middle = start + (end-start)/2;
            if(arr[middle] < arr[middle + 1]){
                start = middle + 1;// we know mid + 1 element greaaten than looking element
            }else{
                end = middle;  // here we dont know mid - 1 element greate than or looking element
            }
        }
        return start; // you can return end also if you wish
    }
}
