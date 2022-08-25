package array.missingnumber;

public class MissNumber1 {
	
	public static int missingNumber(int[] array, int n) {
		
		for(int i=1; i<=n+1; i++) {  //this loop for iteration of 1 to nth natural number, so we have to missing number count also iteration perpose.
			
			int j=0;
			for(j=0; j<n; j++) {
				if(i == array[j]) {
					break;
				}
			}
			if(j == n) { // iterate whole array but number is not match in array element then return this number.
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,5};
		int missNum = missingNumber(array, array.length);
		System.out.println("Missing numbe is:" + missNum);

	}

}

//output: Missing numbe is: 4

//Using while loop:
// 	public static int missingNumber(int[] array, int n) {		
// 		int search = 1;
// 		while(true) {
			
// 			int i=0;
// 			for(i=0;i<n;i++) {
// 				if(search == array[i]) {
// 					break;
// 				}
// 			}
			
// 			if(i==n) {
// 				return search;
// 			}
// 			search++;
// 		}
// 	}
