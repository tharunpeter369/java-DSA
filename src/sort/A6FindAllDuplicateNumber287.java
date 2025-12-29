package sort;

import java.util.Arrays;
import java.util.List;
public class A6FindAllDuplicateNumber287 {
    public static void main(String[] args) {
//        int[] sampleArr = {1,1};
        int[] sampleArr = {1,2,4,2,3};
        int ans = cyclicSort(sampleArr);
//        System.out.println(Arrays.toString(ans)+"answer");
        System.out.println(ans+"answer");
    }
        static int cyclicSort(int[] arr){
        int i =0;
        int count = 0;
        int lastChange=-1;
        while (i < arr.length) {
            System.out.println(i+"fff"+arr[i]);
            int correctIndex = arr[i]-1;
            System.out.println(correctIndex+"rrrtttt"+arr[i]+arr[correctIndex]);
            if(arr[i]!= arr[correctIndex]){
                int temp = arr[correctIndex]; //value also 2    7v
                arr[correctIndex] = arr[i]; // value 3 to index  arr[3] = 4
                arr[i] = temp; // values 2 to index 1    7
            }else{
                if(i+1!= arr[i]){ // element is not equal to index + 1 that means it duplicate
                    return arr[i];
                }
                i++;
            }

        }
        return arr[0];
//        List<Integer> resList = new ArrayList<>();
//        // Loop and check condition
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != j + 1) {
//                resList.add(j + 1);
//            }
//        }
//        return resList;
    }
}
