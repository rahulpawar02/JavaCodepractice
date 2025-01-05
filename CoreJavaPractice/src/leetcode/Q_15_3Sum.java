package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q_15_3Sum {

	private static List<List<Integer>> threeSum;

	public static void main(String[] args) {

		int[] numsArr = { -1, 0, 1, 2, -1, -4 };

		threeSum = threeSum(numsArr);

		threeSum.forEach(e -> {
			System.out.print(e);
		});
	}

	public static List<List<Integer>> threeSum(int[] numsArr) {

		if (numsArr == null || numsArr.length < 3)
			return new ArrayList<>();

		// sort elements
		Arrays.sort(numsArr);

		Set<List<Integer>> resultTripplets = new HashSet<>();

		for (int i = 0; i < numsArr.length - 2; i++) {

			int left = i + 1;
			int right = numsArr.length - 1;

			while (left < right) {

				int sum = numsArr[i] + numsArr[left] + numsArr[right];

				if (sum == 0) {
					resultTripplets.add(Arrays.asList(numsArr[i], numsArr[left], numsArr[right]));
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return new ArrayList<>(resultTripplets);
	}
}
