package sort;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class A7FindAlltheDupes442 {
    public static void main(String[] args) {
//        int[] sampleArr = {1,1,2};
        int[] sampleArr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = cyclicSort(sampleArr);
        System.out.println(ans+"rrrtttt");
    }
    static List<Integer>  cyclicSort(int[] arr){
        int i =0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[correctIndex]; //value also 2    7v
                arr[correctIndex] = arr[i]; // value 3 to index  arr[3] = 4
                arr[i] = temp; // values 2 to index 1    7
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> resList = new ArrayList<>();
        // Loop and check condition
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                resList.add(arr[j]);
            }
        }
        return resList;
    }
}
