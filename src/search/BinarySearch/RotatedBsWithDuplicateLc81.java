package search.BinarySearch;

public class RotatedBsWithDuplicateLc81 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,10,0,1,2};
//        int[] roatedArr = {0, 1, 1, 1, 3};
//        int[] roatedArr = {2, 9 ,2, 2, 2};
//        int[] roatedArr = {1, 1, 1, 3, 0};
//        int[] nums = {1, 0, 1, 1, 1};
        int target = 99;
        int SearchValue = modifiedBinarySearch(nums,target);
        System.out.println(SearchValue+"answer");
    }


    static int modifiedBinarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
//                        return mid;
                System.out.println(mid);
                return mid;
            }
            // Handle duplicates: can't decide side, skip left
            if (nums[start] == nums[mid]) {
                start++;
                continue;
            }
            // Handle duplicates: can't decide side, skip right
            if (nums[end] == nums[mid]) {
                end--;
                continue;
            }
            // Left sorted?
            if (nums[start] <= nums[mid]) {
                // Target in left half?
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right sorted
                // Target in right half?
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}

//Initialize:
//left = 0
//right = length - 1
//
//While left <= right:
//mid = (left + right) / 2  // Safe mid calc
//
//If array[mid] == target:
//Return mid  // Found!
//
//// Skip if duplicates confuse (can't tell sorted side)
//If array[left] == array[mid]:
//left = left + 1
//Skip to next loop  // Continue
//If array[right] == array[mid]:
//right = right - 1
//Skip to next loop  // Continue
//
//// Now, safe to check sorted half
//If left side is sorted (array[left] <= array[mid]):
//If target fits in left (target >= array[left] and target < array[mid]):
//right = mid - 1  // Search left
//Else:
//left = mid + 1   // Search right
//Else:  // Right side must be sorted
//If target fits in right (target > array[mid] and target <= array[right]):
//left = mid + 1   // Search right
//Else:
//right = mid - 1  // Search left
//
//// Not found
//Return -1
