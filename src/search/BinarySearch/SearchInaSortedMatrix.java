package search.BinarySearch;

import java.util.Arrays;

public class SearchInaSortedMatrix {
    //all the row sorted from 0 to end rows are sorted from the begining
//    1.take miidle colum then binary search on that
//    case 1 if elememt == target find the target
//    case 2 if element > target  then row after ignoreed else rows before ignored
//    ok in the end only 2 rows are remaining
//    case 1 check mid colum values are target
//    case 2 consider 4 parts then find answer using simple binary search
    public static void main(String[] args) {
int[][] arr = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
int[] findTarget = search(arr,9);
System.out.println(Arrays.toString(findTarget)+"the answer");
    }
//seardh in the row passed
    static int[] binarySearch(int[][] matrix, int row, int start, int end,int target){
        while(start <= end){
            int mid = end + (start - end)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int column = matrix[0].length; //be caution over here may be it can be empty

        //what if only one row ?? then do simple binary search
        if(rows == 1){
            return binarySearch(matrix,0,0,column-1,target);
        }
        // run the loop till the 2 rows are remaining
        int rowStart = 0;
        int rowEnd = rows-1;
        int middleColumn = column / 2;
        while(rowStart < rowEnd-1){ // while this is true it will having more than 2 rows
            int middleRow = (rowStart + rowEnd)/2;
            if(matrix[middleRow][middleColumn] == target){
                return new int[] {middleRow,middleColumn};
            }

            if(matrix[middleRow][middleColumn] < target){ //
                rowStart = middleRow;
            }else{
                rowEnd = middleRow;
            }
        }

        // now we have 2 rows
//        1.check weather the target in the 2 mid of column
            if(matrix[rowStart][middleColumn]== target){
            return new int[] {rowStart,middleColumn};
            }
//        if(matrix[rowEnd][middleColumn]== target){
//            return new int[] {rowStart,middleColumn};
//        }
        if(matrix[rowStart+1][middleColumn]== target){
            return new int[] {rowStart+1,middleColumn};
        }
        //othere wise
        //        search in 1st half
        if(target <= matrix[rowStart][middleColumn-1]){
            return binarySearch(matrix,rowStart,0,middleColumn-1,target);
        }
        //        search in 2nd half
        if(target >= matrix[rowStart][middleColumn+1] && target <= matrix[rowStart][column -1]){
            return binarySearch(matrix,rowStart,middleColumn+1,column-1,target);
        }
        //        search in 3rd half
        if(target <= matrix[rowStart+1][middleColumn-1]){
            return binarySearch(matrix,rowStart+1,0,middleColumn-1,target);
        }
        //        search in 4th half
        if(target >= matrix[rowStart+1][middleColumn-1]&& target <= matrix[rowStart+1][column -1]){
            return binarySearch(matrix,rowStart+1,middleColumn+1,column-1,target);

        }
        return new int[]{-1,-1};

    }

}
