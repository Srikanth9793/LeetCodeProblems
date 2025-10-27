using System;
using System.Collections.Generic;

public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> map = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            int complement = target - nums[i];

            if (map.ContainsKey(complement))
            {
                return new int[] { map[complement], i };
            }

            map[nums[i]] = i;
        }

        return Array.Empty<int>();
    }

    // Main method to test the TwoSum function
    public static void Main(string[] args)
    {
        Solution solution = new Solution();

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = solution.TwoSum(nums, target);

        if (result.Length > 0)
        {
            Console.WriteLine("Indices: " + result[0] + ", " + result[1]);
        }
        else
        {
            Console.WriteLine("No solution found.");
        }
    }
}
