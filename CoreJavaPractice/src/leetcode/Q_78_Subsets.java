package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q_78_Subsets {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3 };
		List<List<Integer>> resultSets = new ArrayList<>();
	    backTrack(resultSets, new ArrayList<Integer>(), nums, 0);
	    System.out.println(resultSets);
	    

	}

	public static void backTrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) {
		
		
		resultSets.add(new ArrayList<>(tempSet));
		for(int i = start; i<nums.length; i++) {
			
			//case of including number
			tempSet.add(nums[i]);
			
			//backtrack the new subset
			backTrack(resultSets, tempSet, nums, i+1);
			
			//case of non-including the number
			tempSet.remove(tempSet.size() - 1);
		}
	}

}
