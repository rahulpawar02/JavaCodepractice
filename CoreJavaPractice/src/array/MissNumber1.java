package array;

public class MissNumber1 {

	public static int missingNumber(int[] array, int n) {
		
		int search = 1;
		while(true) {
			
			int i=0;
			for(i=0;i<n;i++) {
				if(search == array[i]) {
					break;
				}
			}
			
			if(i==n) {
				return search;
			}
			search++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int missNum = missingNumber(array, array.length);
		System.out.println(missNum);

	}

}
