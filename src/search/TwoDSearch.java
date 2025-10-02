package search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDSearch {
    public static void main(String[] args) {
        int[][] tDarr= {
                {3,21,44},
                {99,45,64,23},
                {11,13,41,2}
        };
        int target = 99;
        int[] ans = search(tDarr,target); //format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] data, int target){
        if(data.length == 0){
            return new int[]{-1,-1};
        }

        for(int i=0; i<data.length; i++){
//            System.out.println(Arrays.toString(data[i]));
            for(int j=0; j<data[i].length; j++){
                if(target == data[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
