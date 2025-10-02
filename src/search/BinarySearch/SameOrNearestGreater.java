package search.BinarySearch;

public class SameOrNearestGreater {

    public static void main(String[] args) {
        System.out.println("hello world");
        int[] sampleArr = { 100,99,77,66,55,44,33,22,11,9,5,3,1};
        int res = findBinarySearch(sampleArr,12);
        System.out.println(res);
    }

    static int findBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = (start+end)/2;
//            System.out.println(arr[middle]+"middle"+start);
//           return 0;
            if (target == arr[middle]) {
                System.out.println(arr[middle]);
//              return arr[middle];
                return middle;
            } else {
//              System.out.println(arr[middle]);
                if (target > arr[middle]) { //right
//                  start = middle + 1;
                    end = middle - 1;

                } else { //left
//                  end = middle - 1;
                    start = middle + 1;
                }
            }

        }
        return end;
    };
}



