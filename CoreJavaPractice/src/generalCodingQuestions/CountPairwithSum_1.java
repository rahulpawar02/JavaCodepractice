package generalCodingQuestions;

//solution 1: brute force approach

public class CountPairwithSum_1 {

	public static void main(String[] args) {

		int arr[] = {1, 5, 7, 1};
		int sum=6;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

/*
Input: N = 4, K = 6 <--sum
	arr[] = {1, 5, 7, 1}
	Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

*/
