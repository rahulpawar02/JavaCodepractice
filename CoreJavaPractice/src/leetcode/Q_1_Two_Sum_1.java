package leetcode;

import java.util.Arrays;

//Appraoch-1: Brute force Appraoch
public class Q_1_Two_Sum_1 {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;

		int[] resultArr = findTwoSum(nums, target);
		System.out.print(Arrays.toString(resultArr));

	}

	public static int[] findTwoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		// In case there is no solution, return an empty array
		return new int[] {};
	}

}

//Output: [0,1]

//Time complexity: O(n).
//We traverse the list containing n elements exactly twice. Since the hash table reduces the lookup time to O(1), the overall time complexity is O(n).

//Space complexity: O(n).
//The extra space required depends on the number of items stored in the hash table, which stores exactly n elements.