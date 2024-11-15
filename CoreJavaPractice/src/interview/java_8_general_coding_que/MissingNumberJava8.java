package interview.java_8_general_coding_que;

import java.util.stream.IntStream;

public class MissingNumberJava8 {
	
	static int missingNumber(int arr[], int n) {
		return n*(n+1)/ 2 - IntStream.of(arr).sum();
	}
	
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5 };
		int result = missingNumber(arr, arr.length + 1); // Total numbers from 1 to n
		System.out.println(result);
	}
}
