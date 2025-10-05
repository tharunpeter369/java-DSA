package search.BinarySearch;

public class RotatedBsLc33 {
    public static void main(String[] args) {
        int[] roatedArr = {4,5,6,7,8,9,10,0,1,2};
        int target = 5;
//        int[] roatedArr = {4,5,6,7,8,9,10};
        //solve steps
//        1. find the peak
        int pivot = findPivot(roatedArr);
        System.out.println(pivot);
        System.out.println(roatedArr.length);
        //if not found pivot( -1 ) its not rotated so just do binary search
        //2.binary search in left if not found BS in right
        int start = 0;
        int end = pivot;


        if(pivot==-1){
            int find = findBinarySearch(roatedArr,target,start,roatedArr.length - 1);
            System.out.println(find);
        }else {

            if(roatedArr[pivot] >= target && target >= roatedArr[0]  ){
                int findLeft = findBinarySearch(roatedArr,target,start,end);
                System.out.println(findLeft);
            }else{
                start = pivot+1;
                end = roatedArr.length - 1;
                int findRight = findBinarySearch(roatedArr, target, start, end);
                System.out.println(findRight);
            }
        }
    }

    static int findBinarySearch(int[] arr, int target,int st,int en){
        int start = st;
        int end = en;
        while(start <= end) {
//          int middle = (start+end)/2;
            int middle = start + (end- start)/2;
//            System.out.println(arr[middle]+"middle"+start);
//           return 0;
            if (target == arr[middle]) {
//                System.out.println(arr[middle]);
//              return arr[middle];
                return middle;
            } else {
//              System.out.println(arr[middle]);
                if (target > arr[middle]) { //right
                  start = middle + 1;
//                    end = middle - 1;
                } else { //left
                  end = middle - 1;
//                    start = middle + 1;
                }
            }
        }
        return -1;
    };

    static int findPivot(int[] arr) {
        //step 1 solutions ( find peak) :- find mid
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //1.if  arr[mid+1] && arr[mid ] > [mid + 1]we find the peak
            //if(arr[mid+1] && arr[mid] > arr[mid+1]){
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //2. if arr[mid-1] && arr[mid] < arr[mid - 1] we find the peak
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //3.if arr[start]>= arr[mid] // then peak inside left side end = mid - 1
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }else{
                //4.if arr[start]>= arr[mid]  // then peak at right side  start = mid + 1
                start = mid + 1;
            }
        }
        return -1;
    };
}
