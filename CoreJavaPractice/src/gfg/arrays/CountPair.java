package gfg.arrays;

import java.util.Map;
import java.util.HashMap;

public class CountPair {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 1 };
		int n = 4;
		int sum = 6;
		getPairCount(arr, n, sum);
	}

public static int getPairCount(int arr[], int sum, int n) {

	Map<Integer, Integer> hm = new HashMap<>();
	//store all element with count
	for(int i=0;i<n;i++) {
	
		if(hm.containsKey(arr[i])) { // if key is not present then add with 0 value 
			hm.put(arr[i], 0);
		}
		//otherwise get the value of that key and increment by one
		hm.put(arr[i], hm.get(arr[i])+1);
		
	}
	
	int totalCount = 0;
	
	
	
	return totalCount;
 }
}
