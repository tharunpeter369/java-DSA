package search.BinarySearch;

public class ORderDiagBinarySearch {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] sampleArr = { 1,2,3,4,5,6,7,8,9};
        int res = findBinarySearch(sampleArr,5);
        System.out.println(res);
    }

    static int findBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
//              System.out.println(arr[middle]);
                if (target > arr[middle]) { //right
                    start = middle + 1;
                } else { //left
                    end = middle - 1;
                }
            }
        }
        return -1;
    };
}
