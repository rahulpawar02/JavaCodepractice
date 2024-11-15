package generalCodingQuestions;

public class MissingNumber_2 {

	static int missingNumber(int arr[], int n) {
		int expSum = n * (n + 1) / 2;
		int actSum = 0;

		for (int num : arr) {
			actSum += num;
		}
		return expSum - actSum;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5 };
		int result = missingNumber(arr, arr.length + 1); // Total numbers from 1 to n
		System.out.println(result);
	}
}

//this Sum of N terms Formula approach this an effiecent and working in unsorted and sorted both.
//Time Complexity: 𝑂(𝑛)
//Space Complexity: O(1)
