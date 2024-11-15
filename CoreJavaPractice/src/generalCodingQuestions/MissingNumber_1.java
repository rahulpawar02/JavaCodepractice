package generalCodingQuestions;

public class MissingNumber_1 {

	static int missingNumber(int arr[], int n) {

		int num = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				num++;
				continue;
			} else {
				return num;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5};
		int result = missingNumber(arr, arr.length);
		System.out.println(result);
	}
}
// This approch efficient when you have sorted Array.
//Time Complexity: 𝑂(𝑛)
//Space Complexity: O(1)