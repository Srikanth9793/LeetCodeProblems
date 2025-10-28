import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();

        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }

        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(sol.containsDuplicate(nums1)); // false
        System.out.println(sol.containsDuplicate(nums2)); // true
    }
}
