package search;

public class numberContainEven {
    public static void main(String[] args) {
        int[] arr = {33,4,555,676,2345,908456,45};
        int ans = countDigit(arr);
        System.out.println(ans);
    }

    static int countDigit(int[] arr){
        //commmo  logical way
//        int count = 0;
//        for(int i =0; i < arr.length; i++){
//            int currNum = arr[i];
//            int currNumLengthCount = 0;
//            int checkCount = currNum;
//            while(checkCount != 0){
//                currNumLengthCount = currNumLengthCount+1;
//                checkCount = checkCount/10;
//            };
//            if(currNumLengthCount%2 == 0){
//                count++;
//            };
//        };
//        return count;

        // easy way
        int count = 0;
        for(int num : arr){
//            int digitCount = (int) Math.floor(Math.log10(n))+1;

            if(String.valueOf(num).length() %2 == 0){
                count ++;
            }
        }
        return count;


    };
}
