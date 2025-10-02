package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] inputArray = {4,6,1,22,88,99,44,2};
        int target = 9;
        int res = linearSearch(inputArray,target);
        System.out.println(res);
        System.out.println(inputArray[res]);

    }
    static int linearSearch(int[] arr ,int target) {
        if(arr.length == 0){
            return  -1;
        }
        for (int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
