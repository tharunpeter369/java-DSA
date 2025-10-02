package search.BinarySearch;

public class InfiniteArrayFind {
    public static void main(String[] args) {

        int[] sampleArr = { 2,3,4,5,6,7,8,9,10,11,12,13,14,1,5,16,17,18,19,20,30,40,50,60};
        int res = findBinarySearch(sampleArr,12);
        System.out.println(res+"result");
    }
    static int findBinarySearch(int[] arr, int target){
        int[] bounds = findStartAndEndIndex(arr, target);
        System.out.println("hello worldbounds"+bounds[0]+bounds[1]);
        int start = bounds[0];
        int end = bounds[1];
        while(start <= end) {
            int middle = (start+end)/2;
            System.out.println(arr[middle]+"middle"+start);
//           return 0;
            if (target == arr[middle]) {
                System.out.println(arr[middle]);
//              return arr[middle];
                return middle;
            } else {
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

    static int[] findStartAndEndIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            System.out.println(target+"hello world"+arr[end]);
            int newStart = end + 1;
            end = end + (end-start +1 )*2; //double of current array length
            start = newStart;
        }
        return new int[]{start, end};
    }
}
