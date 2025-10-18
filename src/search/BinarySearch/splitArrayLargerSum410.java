package search.BinarySearch;

public class splitArrayLargerSum410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k =2;
        int ans = splitArray(nums,k);
        System.out.println(ans+"hello world");
    }
    // Split array into k non-empty CONTIGUOUS parts
    // so that the LARGEST part sum is as small as possible.
    // We binary-search that answer and use a greedy check.
    static int splitArray(int[] nums, int k) {
        // The answer is between:
        // - low = max element (no part can be smaller than the biggest single number)
        // - high = sum of all elements (one big part)
        int low = 0;
        long high = 0; // use long to avoid overflow while summing

        for (int x : nums) {
            low = Math.max(low, x);
            high += x;
        }

        long left = low, right = high;
        // Binary search the smallest "max allowed subarray sum" that still works
        while (left < right) {
            long mid = (left + right) / 2; // candidate cap on any part's sum

            // If we can split into <= k parts with this cap, try a smaller cap
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                // Otherwise we need a larger cap
                left = mid + 1;
            }
            //o, 10,32  == 21
            //1. 10, 21    == 15
            //2. 16 ,21  == 18
            //3. 16 ,18  = 17
            //4. 18 ,18   = 18
        }

        // left == right: the minimized largest sum
        return (int) left; // safe to cast under problem constraints
    }

    // Greedy check:
    // Walk left-to-right, start a new part whenever adding the next number
    // would exceed "maxAllowed". Count how many parts you needed.
    private static boolean canSplit(int[] nums, int k, long maxAllowed) {
        System.out.println(maxAllowed+"hello");
//        int[] nums = {7,2,5,10,8};  21 ,15 ,18,17,
        int parts = 1;     // at least one part
        long curr = 0;     // current part's sum
        for (int x : nums) {
            if (curr + x <= maxAllowed) {
                // keep filling current part
                curr += x;
            } else {
                // start a new part at x
                parts++;
                curr = x;

                // If we already exceed k parts, this cap is too small
                if (parts > k) return false;
            }
        }
        // We managed with k or fewer parts → cap is feasible
        return true;
    }
}
