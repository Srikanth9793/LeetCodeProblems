import java.util.HashSet;
import java.util.Set;

public class Solution {

    // This method checks if there are duplicate elements within distance 'k' in the array
    // We use a HashSet for fast lookup and apply the Sliding Window technique
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the element already exists in the current window, we found a nearby duplicate
            if (set.contains(nums[i])) {
                return true;
            }

            // Add the current element to the window
            set.add(nums[i]);

            // Maintain the window size to at most 'k'
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        // If no duplicates found within distance k
        return false;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = sol.containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);
    }
}
