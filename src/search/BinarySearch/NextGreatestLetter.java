package search.BinarySearch;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] givenArr = {'c', 'f', 'j'};


        char res = findFloor(givenArr, 'd');
        System.out.println(res);


    }

    static char findFloor(char[] givenArr, char target) {
        int start = 0;
        int end = givenArr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (givenArr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return givenArr[start % givenArr.length];
        // Array: ['c', 'f', 'j'] (length = 3)

//target = 'a' → start = 0 → 0 % 3 = 0 → letters[0] = 'c' ✓
//target = 'd' → start = 1 → 1 % 3 = 1 → letters[1] = 'f' ✓
//target = 'g' → start = 2 → 2 % 3 = 2 → letters[2] = 'j' ✓
//target = 'z' → start = 3 → 3 % 3 = 0 → letters[0] = 'c' ✓ (wraps!)
    }
}



//public char nextGreatestLetter(char[] letters, char target) {
//    int start = 0;
//    int end = letters.length - 1;
//    int result = 0;  // Default to first element
//
//    while (start <= end) {
//        int mid = start + (end - start) / 2;
//
//        if (letters[mid] > target) {
//            result = mid;     // Store potential answer
//            end = mid - 1;    // Look for smaller valid answer
//        } else {
//            start = mid + 1;  // Look for bigger letters
//        }
//    }
//
//    return letters[result];
//}
