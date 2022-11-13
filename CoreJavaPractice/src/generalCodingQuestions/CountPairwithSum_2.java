package generalCodingQuestions;

import java.util.Arrays;

//Solution 2: Two pointer approach
public class CountPairwithSum_2 {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 5, 1, -1, 4}; //this approach is not work if array contains duplicate elements.
		int targetSum = 6;
		Arrays.sort(arr);
		//{-1, 2, 4, 5, 7}
		
		int left = 0;
		int right = arr.length-1;
		int count = 0;
		while(left<right) {     //if sum of the values(left+right) is less than the target(Targetsum) value, then we increment the left pointer. 
		if (arr[left] + arr[right] == targetSum) {   //if sum of the values(left+right) is greater than the target(Targetsum) value, then we decrement the right pointer.
		//	System.out.println("values:"+arr[left]+""+arr[right]);
			count++;
			left++;
			right--;

		} else {
			if (arr[left] + arr[right] < targetSum) {
				left++;
			} else {
				right--;
			}
		  }
		}
		System.out.println(count);
		
	}

}
