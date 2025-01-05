package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Appraoch 2: using HashMap
public class Q_1_Two_Sum_2 {

	public static void main(String[] args) {
		// int nums[] = {2,7,11,15};
		int nums[] = { 16, 4, 23, 8, 15, 42, 1, 2 };
		int target = 19;

		int[] resultArr = findTwoSum(nums, target);
		System.out.print(Arrays.toString(resultArr));

	}

	public static int[] findTwoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (map.containsKey(comp)) {
				return new int[] { map.get(comp), i };
			}
			map.put(nums[i], i);
		}

		// In case there is no solution, return an empty array
		return new int[] {};
	}
}

//output: [1, 4]

//time complexity: O(n) - because we scanning array once.
//space complexity: O(n) - because we create the hashmap that could be size depends on the numbers in array.