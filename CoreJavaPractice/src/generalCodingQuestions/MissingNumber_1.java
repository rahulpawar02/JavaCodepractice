package generalCodingQuestions;

import java.util.Arrays;

public class MissNumber {

	static int missingNumber(int array[], int n) {
		
		Arrays.sort(array);
		
		int num = 0;
		for(int i=1;i<=n;i++) {
			
			for(int e: array) {
				if(e==i) {
					break;
				}
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		int array[] = {2,1,3,5};
		missingNumber(array, array.length);
	}
}
