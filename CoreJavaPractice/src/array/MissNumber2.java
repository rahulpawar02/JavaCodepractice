package array;

public class MissNumber2 {

	static int missingNumber(int arr[], int n) {
		
		//int sum=(n*(n+1))/2;
		//if all element is present in array then formula will be int sum=(n*(n+1))/2; for
		//find sum of first natural number but already one element is missing so we need to add +1 into n of array size. then modified formula is
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int x : arr) {
			sum -= x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,5};
		int missNum = missingNumber(array, array.length);
		System.out.println(missNum);
	}
}
