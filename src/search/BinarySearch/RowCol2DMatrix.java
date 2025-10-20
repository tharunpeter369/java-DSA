package search.BinarySearch;

import java.util.Arrays;

public class RowCol2DMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 0;
        int [] search = findElement(arr,target);
//        System.out.println(search + "got the answer");
        System.out.println(Arrays.toString(search) + "got the answer");
    }
    static int[] findElement(int[][] matrix,int target){
        //row and column sorted
        //take row and column
//        int rowStart = matrix[0][0];
//        int columStart = matrix[0][matrix[0].length-1];
        int rowStart = 0;
        int columStart = matrix[0].length-1;
        System.out.println(rowStart + "got"+columStart);
        while(rowStart <= matrix.length -1 &&  columStart >= 0 ){
            System.out.println(rowStart + "got"+columStart);
            if(matrix[rowStart][columStart] == target){
                return new int[]{rowStart,columStart};
            }
            if(matrix[rowStart][columStart] > target){
                columStart--;
            }else{
                rowStart++;
            }
        }
        return new int[]{-1,-1};
    }
}
