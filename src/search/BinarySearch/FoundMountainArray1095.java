package search.BinarySearch;

public class FoundMountainArray1095 {
    public static void main(String[] args) {
//        int[] sampleArray = {0,2,3,4,3,2,1};
        int[] sampleArray = { 1,2,3,4,5,3,1};
        int res = mountainValue(sampleArray);
        System.out.println(res);
        //first searh left side
        int ans = findBinarySearch(sampleArray,3,0,res);
        System.out.println(ans);
        if(ans == -1 ){
           int getEnd = sampleArray.length - 1;
             ans = findBinarySearch(sampleArray,3,res,getEnd);
        }
        System.out.println(ans);
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

    static int findBinarySearch(int[] arr, int target,int getstart,int getend){
        int start = getstart;
        int end = getend;
        while(start <= end) {
//            int middle = (start+end)/2;
            int middle = start + (end-start)/2;
            System.out.println(arr[middle]+"middle"+start);
//           return 0;
            if (target == arr[middle]) {
                System.out.println(arr[middle]);
//                return arr[middle];
                return middle;
            } else {
                if(arr[start] < arr[end]) {
                    if (target > arr[middle]) { //right
                        start = middle + 1;
                    } else { //left
                        end = middle - 1;
                    }
                }
                else {
                    if (target < arr[middle]) { //right
                        start = middle + 1;
                    } else { //left
                        end = middle - 1;
                    }
                }
            }
        }
        return -1;
    };
}
